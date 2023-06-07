package com.epam.automation.main;

import java.io.IOException;

public class InputProgram {
    public static void main(String[] args) {
        try {
            int x = System.in.read();
            System.out.println("code =" + x + " x=" + (char)x);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
