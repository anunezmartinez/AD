package com.company;

import java.io.*;

public class Copybytexto {

    public void leerTexto(File file1, File file2) {
        try {
            FileInputStream inputFile = new FileInputStream(file1);
            FileOutputStream outputFile = new FileOutputStream(file2);

            outputFile.write(inputFile.readAllBytes());
            outputFile.close();
            inputFile.close();

            System.out.println("El fichero fue copiado y escrito correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void leerTexto2(File file1, File file2) {
        try{
            FileInputStream inputFile = new FileInputStream(file1);
            FileOutputStream outputFile = new FileOutputStream(file2, true);

            outputFile.write(inputFile.readAllBytes());
            outputFile.close();
            inputFile.close();

            System.out.println("El fichero fue copiado y escrito correctamente.");
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
