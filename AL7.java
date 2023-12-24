//Write a Java program to search for an element in an array list.
import java.util.ArrayList;

public class AL7 {
    public static void main(String[] args) {
        ArrayList<String>al7=new ArrayList<>();
        al7.add("Red");
        al7.add("Blue");
        al7.add("Green");
        al7.add("White");
        al7.add("Violet");
        System.out.println(al7);
        if(al7.contains("Red")){
            System.out.println("color found");
        }
        else{
             System.out.println("color not found");
        }
       
        
    }

    
}