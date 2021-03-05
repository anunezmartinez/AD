/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa15bis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.xml.stream.XMLStreamException;

public class exa15bis {

    public static Connection conn ;
    public static  Statement stmt ;
    public static  Statement stmt2 ;
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
    String driver = "jdbc:oracle:thin:";
    String host = "localhost.localdomain"; // tambien puede ser una ip como "192.168.1.14"
    String porto = "1521";
    String sid = "orcl";
    String usuario = "hr";
    String password = "123";
    String url = driver + usuario + "/" + password + "@" + host + ":" + porto + ":" + sid;
    conn = DriverManager.getConnection(url);
    return conn;
    }
    
    public static void ler_serial() throws FileNotFoundException, IOException, ClassNotFoundException{
    // ESTE metodo esta feito para ler o contido do ficheiro "serial" cando rematedes 
     FileInputStream fis = new FileInputStream("/home/oracle/Desktop/compartido/JavaAD/src/exa15bis/serial.txt");
     ObjectInputStream ois = new ObjectInputStream(fis);
     Platosgraxa object =new Platosgraxa();
     while ((object=(Platosgraxa)ois.readObject()) != null) {
      System.out.println(object);
    }
    ois.close();
    fis.close();
     
    }

   
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        
        String ruta = "/home/oracle/Desktop/compartido/JavaAD/src/exa15bis/serial.txt";

        FileOutputStream ficheiro = new FileOutputStream(ruta);
        ObjectOutputStream escribir = new ObjectOutputStream(ficheiro);
        
        conn = getConnection();
        stmt = conn.createStatement();
        stmt2 = conn.createStatement();
        
        String consultaPlatos = "select * from platos";
        ResultSet st = stmt.executeQuery(consultaPlatos);
        
        String nomc = null;
        while(st.next()){
        
        String codpp = st.getString("codpp");
        String nomp = st.getString("nomp");
        
        System.out.println("Codigo de plato : " + codpp + " nome do prato : " + nomp);
        
        
        
        String consultaNome = "Select nomc from composicion where codp ='" + codpp+"'";
        ResultSet st2 = stmt2.executeQuery(consultaNome);
        while(st2.next()){
            nomc = st2.getString("nomc");
            System.out.println("Nome do coponente : " + nomc);
        }
        
        
        String consultaGrasa = "Select graxa from composicion where codp ='" + codpp+"'";
        ResultSet st3 = stmt2.executeQuery(consultaGrasa);
        int graxatotal = 0;
        while(st3.next()){
            graxatotal = graxatotal + st3.getInt("graxa");   
        }
        System.out.println(graxatotal);
        
        
        
        Platosgraxa pg = new Platosgraxa();
        pg.setCodigop(codpp);
        pg.setNomep(nomp);
        pg.setGraxatotal(graxatotal);
        escribir.writeObject(pg);
        
        
        }
       escribir.writeObject(null); 
       escribir.close();
       ler_serial();
       
    }
    
}
