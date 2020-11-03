package com.company;

import java.io.*;
import java.util.Scanner;

public class Primitivewritechars {
    public void leerUFT(File file1){
        try{
            DataInputStream input = new DataInputStream(new FileInputStream(file1));
            DataOutputStream output = new DataOutputStream(new FileOutputStream(file1));
            Scanner sc = new Scanner(System.in);
            int menu = 0;
            String text = "";
            do{
                System.out.println("Que quieres hacer?\n" +
                        "1 - Escribir un Sting\n" +
                        "2 - Leer el fichero\n" +
                        "3 - Salir");
                menu = sc.nextInt();
                switch(menu) {
                    case 1:
                        System.out.print("Escribiendo el string : ");
                        sc.nextLine();
                        text = sc.nextLine();
                        System.out.println(text);
                        output.writeChars(text);
                        System.out.println("Longitud del String a escribir " + output.size());
                        break;
                    case 2:
                        StringBuilder word= new StringBuilder();
                        System.out.println("Quedan " + input.available() + " bytes por leer.");
                        for (int i = 0; i < text.length(); i++) {
                        word.append(input.readChar());
                        }
                        System.out.println(word);

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
