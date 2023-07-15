/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Product {
  private int pid;
  private String pname;
  private int pprice;

    public Product(int pid, String pname, int pprice) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
    }
  
    public int getPid(){
    return pid;
    }
    
    public String getPname(){
        return pname;
    }
    public int getPprice(){
        return pprice;
    }
  @Override
    public String toString(){
        return pid+" "+pname+" "+pprice;
    }
}

class Curd{
    public static void main (String[] args){
        List<Product> pro =new ArrayList<>();
        
        Scanner sc =new Scanner(System.in);
         Scanner sc1 =new Scanner(System.in);
         
         int ch;
          do{
            System.out.println("1. INSERT PRODUCT");
            System.out.println("2. DISPLAY PRODUCT");
            System.out.println("3. SEARCH PRODUCT");
            System.out.println("4. DELETE PRODUCT");
            System.out.println("5. UPDATE PRODUCT");
            System.out.println("0. Exit");
            
            System.out.println("Enter Your choice :- ");
            ch =sc.nextInt();
            
             switch(ch){
                 case 1 -> {
                     System.out.println("Enter Product Id :- ");
                     int pid =sc.nextInt();
                     System.out.println("Enter Product Name:- ");
                     String pname =sc1.nextLine();
                     System.out.println("Enter Product Price :- ");
                     int pprice =sc.nextInt();
                     
                     pro.add(new Product(pid,pname,pprice));
                }
                     
                 case 2 -> {
                     System.out.println("-----------------------------------------");
                     for (Product p: pro) {
                         
                         System.out.println("PID | PNAME | PPRICE ");
                         System.out.println(p);
                     }
                     System.out.println("-----------------------------------------");
                }
                     
                 case 3 -> {
                     boolean found= false;
                     System.out.println("Enter Product Id  to Search");
                     int pid1 =sc.nextInt();
                     System.out.println("-----------------------------------------");
                     for (Product p : pro) {
                         if(p.getPid()== pid1){
                             System.out.println(p);
                             found=true;
                         }
                     }
                     if(!found){
                         System.out.println("Product  Doesnt Exit");
                     }
                     System.out.println("-----------------------------------------");
                }
                 case 4 -> {
                    boolean found = false;
                    System.out.println("Enter Product  Id number to Delte");
                    int Pid =sc.nextInt();
                    System.out.println("-----------------------------------------");
                    Iterator<Product> i = pro.iterator();
                    while(i.hasNext()){
                        Product p =i.next();
                        if(p.getPid()== Pid){
                            i.remove();
                            System.out.println(p);
                            found=true;
                        }
                        
                    }
                    if(!found){
                        System.out.println("Product Doesn't Exit");
                    }
                    else{
                        System.out.println("Product  is Deleted Succesfully");
                    }
                    System.out.println("-----------------------------------------");
                }
                     
                 case 5 -> {
                    boolean found = false;
                    System.out.println("Enter Product  Id  to Update ");
                    int pid2 =sc.nextInt();
                    System.out.println("-----------------------------------------");
                    ListIterator<Product> li = pro.listIterator();
                    String pname1;
                    int pprice1;
                    while(li.hasNext()){
                        Product p=li.next();
                        if(p.getPid()== pid2){
                            System.out.println("Enter The New Name ");
                            pname1 =sc1.nextLine();
                            System.out.println("Enter The New Price ");
                            pprice1 =sc.nextInt();
                            li.set(new Product(pid2,pname1,pprice1));
                            
                            found=true;
                        }
                        
                    }
                    if(!found){
                        System.out.println("Product Doesnt Exit");
                    }
                    else{
                        System.out.println("Product is updated Succesfully");
                    }
                    System.out.println("-----------------------------------------");
                }
             }
          
          }while(ch!=0);
          
    }
}
