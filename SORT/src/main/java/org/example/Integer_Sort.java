package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class Integer_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(19);
        al.add(17);
        al.add(22);
        al.add(15);
        System.out.println("<------------ Before sort -------------->");
        for (Integer i : al) {
            System.out.println(i);
        }
        System.out.println("<------------ After sort -------------->");
        Collections.sort(al);
        for(Integer i:al){
            System.out.println(i);
        }

    }
}