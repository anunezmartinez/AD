package com.company;

import java.io.*;
import java.util.Scanner;

public class PrimitiveWriteUTF {

    public void leerUFT(File file1){
        try{
            DataInputStream input = new DataInputStream(new FileInputStream(file1));
            DataOutputStream output = new DataOutputStream(new FileOutputStream(file1));
            Scanner sc = new Scanner(System.in);
            int menu = 0;
            do{
                System.out.println("Que quieres hacer?\n" +
                        "1 - Escribir un Sting\n" +
                        "2 - Leer el fichero\n" +
                        "3 - Salir");
                menu = sc.nextInt();
                switch(menu) {
                    case 1:
                        System.out.print("Escribiendo el string : ");
                        output.writeUTF(sc.next());
                        break;
                    case 2:
                        while(input.available() != 0){
                            System.out.println(input.readUTF());
                            System.out.println(input.available() + " bytes left.");
                        }
                        break;
                    case 3:
                        break;
                    default:
                        // code block
                }
            } while(menu < 3);


        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
