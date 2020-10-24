package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PrimitiveWriteUTF lecturaUTF = new PrimitiveWriteUTF();
        File file1 = new File("src/com/company/texto1.txt");
        lecturaUTF.leerUFT(file1);
    }
}
