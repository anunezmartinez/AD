package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Copybytexto leer = new Copybytexto();
        File texto1 = new File("src/com/company/texto1.txt");
        File texto2 = new File("src/com/company/texto2.txt");
        leer.leerTexto2(texto1, texto2);
    }
}
