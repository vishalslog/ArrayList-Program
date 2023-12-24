//Write a Java program to test whether an array list is empty or not.

import java.util.ArrayList;

public class AL18 {
    public static void main(String[] args) {
        ArrayList<String>al18=new ArrayList<>();
        al18.add("Red");
        al18.add("Blue");
        al18.add("Green");
        al18.add("White");
        al18.add("Violet");
        System.out.println("before empty we check:----"+al18.isEmpty());
        al18.removeAll(al18);
        System.out.println("is it empty:----"+al18);
        System.out.println(al18.isEmpty());
        
        
        
    }
}
