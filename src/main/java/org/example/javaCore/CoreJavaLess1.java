package org.example.javaCore;

public class CoreJavaLess1 {
    public static void main(String[] args) {

        int number = 1;
        String webSite = "Rahul Shetty Academy";
        char letter = 'r';
        double dec = 5.99;
        float dec2 = -5;
        boolean myCard = true;

        System.out.println(number+dec);

        // Arrays

        int[] array = new int[5];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;

        int[] arr2 = {1,2,3,4,5};
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]*2);
        }

        String[] name = {"rahul","shetty","academy"};
        for (int i=0;i< name.length;i++){
            System.out.println( name[i].toString().toUpperCase());
        }
        for (String s:name) {
            System.out.print(s.toString().toUpperCase() +" ");
        }
    }
}
