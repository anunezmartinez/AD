package com.company;

import java.io.*;

public class Copybyimaxe {

    public void leerImage(File file1, File file2) {
        try {
            BufferedInputStream inputFile = new BufferedInputStream(new FileInputStream(file1));
            BufferedOutputStream outputFile = new BufferedOutputStream(new FileOutputStream(file2));

            outputFile.write(inputFile.readAllBytes());
            outputFile.close();
            inputFile.close();

            System.out.println("El fichero fue copiado y escrito correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void leerImage2(File file1, File file2) {
        try{
            BufferedInputStream inputFile = new BufferedInputStream(new FileInputStream(file1));
            BufferedOutputStream outputFile = new BufferedOutputStream(new FileOutputStream(file2, true));

            outputFile.write(inputFile.readAllBytes());
            outputFile.close();
            inputFile.close();

            System.out.println("El fichero fue copiado y escrito correctamente.");
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
