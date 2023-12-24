//Write a Java program to clone an array list to another array list.

import java.util.ArrayList;
import java.util.Collections;

public class AL16 {
    public static void main(String[] args) {
        ArrayList<String>al16=new ArrayList<String>();
        al16.add("Red");
        al16.add("Blue");
        al16.add("Green");
        al16.add("White");
        al16.add("Violet");
        System.out.println("before clone:------");
        System.out.println(al16);

        ArrayList<String>al16c=new ArrayList<String>();
        al16c=(ArrayList<String>) al16.clone();
        System.out.println("after clone:---");
        System.out.println(al16c);
        
    }
}
