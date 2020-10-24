package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Copybyimaxe image = new Copybyimaxe();
        File image1 = new File("src/com/company/foto.jpg");
        File image2 = new File("src/com/company/foto2.jpg");
        image.leerImage(image1, image2);
    }
}
