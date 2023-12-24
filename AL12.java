//Write a Java program to compare two array lists.
import java.util.ArrayList;

public class AL12 {
public static void main(String[] args) {
    ArrayList<String>al12=new ArrayList<>();
        al12.add("Red");
        al12.add("Blue");
        al12.add("Green");
        al12.add("White");
        al12.add("Violet");

        ArrayList<String>alc7=new ArrayList<>();
        alc7.add("Red");
        alc7.add("Blue");
        alc7.add("Green");
        alc7.add("White");

        ArrayList<String>ald7=new ArrayList<>();
        for(String e:al12){
            ald7.add(alc7.contains(e)?" YES": "NO" );
            

        }
        System.out.println(ald7);
      
}
    
}