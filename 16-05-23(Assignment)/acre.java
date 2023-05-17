import java.util.Scanner;
public class acre {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length in feet :- ");
        float a = sc.nextInt();
        System.out.println("Enter Width in feet :- ");
        float b = sc.nextInt();
        
        int acre = 43560;
        
        float cal = a*b/acre;
        
        System.out.println("the area of the field is :- "+cal+" Acre");
        
    }
    
}