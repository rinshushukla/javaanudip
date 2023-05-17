import java.util.Scanner;
public class CtoF {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Temperture in Celsius");
        int c =sc.nextInt();
        
        System.out.println("Temperature in Fahrenhit is "+c*1.8+32);
        
        
        
    }
    
}