package ru.bulkashmak;

import java.io.IOException;

public class App {

    public static void main( String[] args ) {

        try {
            Utility.reader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
