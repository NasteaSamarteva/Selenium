package org.example.javaCore;

public class CoreJavaLess3 {
    public static void main(String[] args) {
        String s = "Nastya + Andrey = lubov";
        String s1 = "Nastya + Andrey = lubov";

        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String s4 = "Nastya Andrey lubov";
        String[] split = s4.split(" ");
        for (int i = s4.length() - 1; i >= 0; i--) {
            System.out.println(s4.charAt(i));
        }
    }
}
