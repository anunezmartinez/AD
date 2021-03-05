package exa15bis;


public static void ler_serial() throws FileNotFoundException, IOException, ClassNotFoundException{
    // ESTE metodo esta feito para ler o contido do ficheiro "serial" cando rematedes 
     FileInputStream fis = new FileInputStream("serial");
     ObjectInputStream ois = new ObjectInputStream(fis);
     Platosgraxa object =new Platosgraxa();
     while ((object=(Platosgraxa)ois.readObject()) != null) {
      System.out.println( object);
    }
    ois.close();
    fis.close();
     
     }
