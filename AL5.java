//Write a Java program to update an array element by the given element.
import java.util.ArrayList;

public class AL5 {
    public static void main(String[] args) {
         ArrayList<String>al5=new ArrayList<>();
        al5.add("Red");
        al5.add("Blue");
        al5.add("Green");
        al5.add("White");
        al5.add("Violet");
        System.out.println("Before updattion Color is:"+al5);
        al5.set(3, "Purple");
        System.out.println("After updation color is:"+ al5);
    }

    
}