
public class ch9_Labprogram3 {
public static void main(String[] args)
{
int a=5;
int b=0;
try
{
System.out.println(a/b);
}
catch(ArithmeticException e)
{
    System.out.println(e);
}
}
}
