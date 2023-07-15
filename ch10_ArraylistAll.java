
import java.util.ArrayList;
import java.util.Scanner;
public class ch10_ArraylistAll {
    public static void main(String[] args) {
        ArrayList <Integer> integers=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
         
         while(true)
         {
            System.out.println("\nENTER YOUR CHOICE\n1:ADD\n2:REMOVE\n3:REPLACE\n4:display\n5:exit");
             int choice=sc.nextInt();
             System.out.println("*****");

          switch(choice)
             {
                case 1:
                {
                   System.out.println("enter the number of element you want to add");
                   int n=sc.nextInt();
                   for(int i=0;i<n;i++)
                     {
                       System.out.println("enter your "+i+"element");
                       int s=sc.nextInt();
                       integers.add(s);
                    
                     }
                     System.out.println(integers);
                      break;
                }
                case 2:
                {
                    System.out.println("enter the element you want to remove");
                    int e=sc.nextInt();
                    if(integers.contains(e))
                    {
                        integers.remove(Integer.valueOf(e));
                    } 
                    else
                    {
                        System.out.println("elemet not found");
                    }   
                        System.out.println(integers);
                        break;
                    
                }
                case 3:
                {
                    System.out.println("enter the index u want to replace");
                    int ind=sc.nextInt();
                    System.out.println("enter the value u want to replace");
                    int val=sc.nextInt();
                    integers.set(ind,val);
                    

                }
                case 4:
                {
                    System.out.println("LIST"+integers);
                }
                case 5:
                {
                  if(choice==5){
                        break;
                  }
                }
             }
             sc.close();
        }
    }
 }