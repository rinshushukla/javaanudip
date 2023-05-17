import java.util.Scanner;
public class SI {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Principal Amount");
        int p =sc.nextInt();
        System.out.println("Enter The Rate of interest "); 
        int r =sc.nextInt();
         System.out.println("Enter The Period Of Time  "); 
        int t =sc.nextInt();
        
        System.out.println("The Simple Interest of Given Data Is "+p*r*t/100);       
        
        
    }
    
}