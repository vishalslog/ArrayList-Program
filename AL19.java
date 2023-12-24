//Write a Java program for trimming the capacity of an array list.

import java.util.ArrayList;

public class AL19 {
    public static void main(String[] args) {
        ArrayList<String>al19=new ArrayList<>();
        al19.add("Red");
        al19.add("Blue");
        al19.add("Green");
        al19.add("White");
        al19.add("Violet");
        System.out.println("before the trimming:----"+al19);
        al19.trimToSize();
        System.out.println(al19);
        
        
    }
    
}
