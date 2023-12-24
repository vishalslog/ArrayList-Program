// Replace the second element of a ArrayList with the specified element
import java.util.ArrayList;

public class AL21 {
   public static void main(String[] args) {
    ArrayList<String>al21=new ArrayList<>();
        al21.add("Red");
        al21.add("Blue");
        al21.add("Green");
        al21.add("White");
        al21.add("Violet");
        System.out.println("before repacing:---"+al21);
        al21.set(2, "purple");
        System.out.println("after replacing:-----"+al21);
      
   } 
}
