import java.util.Scanner;

public class ch1_abc
{
    public static void main(String[] args)
    {
        int a1,b1,c1;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the value of  a ,b,c");
      a1 = input.nextInt();
      b1= input.nextInt();
      c1 = input.nextInt();
      System.out.println("the value of a is " + a1 + "value of b is" +b1+"value of c is " +c1);
        input.close();
    }
}

