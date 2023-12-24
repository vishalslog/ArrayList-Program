// Write a Java program to extract a portion of an array list.

import java.util.ArrayList;
import java.util.List;

public class AL13 {
    public static void main(String[] args) {
        ArrayList<String>al13=new ArrayList<>();
        al13.add("Red");
        al13.add("Blue");
        al13.add("Green");
        al13.add("White");
        al13.add("Violet");
        
        System.out.println("before extracting:"+al13);
        List<String> sub_List = al13.subList(0, 3);
        System.out.println("after extracting"+sub_List);
        

    }
}
