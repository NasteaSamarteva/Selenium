package org.example.javaCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaLess2 {
    public static void main(String[] args) {

        int[] arr2 = {1, 4, 67, 3, 6, 8, 7, 43, 32, 57, 9, 2, 12, 7, 486780967, 3};

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
            }
        }
        List<String> list = new ArrayList<String>();
        list.add("fff");
        list.add("aaa");
        list.add("sss");
        list.add("rrr");
        list.get(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.contains("fff"));

        String[] names = {"nastya", "andrey"};
        List<String> namesAsList = Arrays.asList(names);
        for (int i = 0; i < namesAsList.size(); i++) {
            System.out.println(namesAsList.get(i));
        }

    }
}
