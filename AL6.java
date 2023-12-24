//Write a Java program to remove the third element from an array list.
import java.util.ArrayList;

public class AL6 {
    public static void main(String[] args) {
        ArrayList<String>al6=new ArrayList<>();
        al6.add("Red");
        al6.add("Blue");
        al6.add("Green");
        al6.add("White");
        al6.add("Violet");
        System.out.println("Before Removing the color:"+al6);
        al6.remove(3);
        System.out.println("After Removing the color:"+al6);
    }
}
