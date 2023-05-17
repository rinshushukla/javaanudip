import java.util.Scanner;
public class Retail {
    public static void main (String[] args){
       
		Scanner sc = new Scanner(System.in);
		int widgetsWeig = 75;
		int gizmosWeig = 112;
		System.out.println("Enter the number of widget : ");
		int num_w  = sc.nextInt();
		System.out.println("Enter the number of gizmos : ");
		int num_g = sc.nextInt();
                int a =num_w * widgetsWeig;
		System.out.println("Total weight of widget : "+a);
                int b=num_g * gizmosWeig;
		System.out.println("Total weight of widget : "+b);
                int c = a+b;
                System.out.println("Total Weight is "+c);
                
    }
    
}