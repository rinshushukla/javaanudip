import java.util.Scanner;
public class Area {
    public static void main (String[] args){
        
        
       System.out.println("Please Enter The Opertion You want to perform");
       System.out.println("to Find Area of square Press 1");
       System.out.println("to Find Area of  Triangle Press 2");
       System.out.println("to Find Area of  Rectangle Press 3");
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("");
        
         switch (a)
        {
            
            case 1 -> {
                System.out.println(" Enter The Side Of the square");
                
                int b=sc.nextInt();
                System.out.println("Area of sqyare is "+b*b);
            }
                case 2 -> {
                    System.out.println(" Enter Bredth of triangle ");
                int d=sc.nextInt();
                    System.out.println("Enthe Height of The triangle");
                int e=sc.nextInt();
                    System.out.println("Area of Triangle is "+d*e);
                }
                
                case 3 ->{
                    System.out.println("Enter lenght of Rectangle");
                    int l =sc.nextInt();
                    System.out.println("Enter Width of Rectangle");
                    int w=sc.nextInt();
                    System.out.println("Area of rectaangle is "+l*w);
                }
                default -> System.out.println("");
        }
       
            
        
            
        
        
    }
    
}
