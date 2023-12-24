//Write a Java program to join two array lists.

import java.util.ArrayList;



public class AL15 {
    public static void main(String[] args) {
        ArrayList<String>al15=new ArrayList<String>();
        al15.add("Red");
        al15.add("Blue");
        al15.add("Green");
        al15.add("White");
        al15.add("Violet");
        System.out.println("1st arraylist:-----");
        System.out.println(al15);


         ArrayList<String>al15c=new ArrayList<>();
        al15c.add("Red");
        al15c.add("Blue");
        al15c.add("Green");
        al15c.add("White");
        al15c.add("Violet");
        System.out.println("2nd arraylist:------");
        System.out.println(al15c);

        ArrayList<String>al15cc=new ArrayList<>();
        al15cc.addAll(al15);
        al15cc.addAll(al15c);
        System.out.println("new ArrayList are:---");
        System.out.println(al15cc);

        
    }
}
