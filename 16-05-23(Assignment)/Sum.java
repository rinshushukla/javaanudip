import java.util.Scanner;
public class Sum {
    public static void main (String[] args){
        int i,num, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any natural number :- ");
        num = sc.nextInt();
        
        sum = num*(num+1)/2;
        
        System.out.println("Sum of "+num+" Natural number is "+sum);
        
    }
    
}