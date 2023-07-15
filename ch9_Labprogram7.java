class student1
{
static String collegename="PES";
int rollno;
String name;
student1(int rollno,String name)
{
this .rollno=rollno;
this .name=name;
}
void display()
{
System.out.println(collegename+" "+rollno+" "+name);
}

}
public class ch9_Labprogram7
{
public static void main(String args[])
{
System.out.println("objects sharing static variable: collegename");
student1 s1=new student1(101,"abhishek");
student1 s2=new student1(102,"rahul");
s1.display();
s2.display();
System.out.println("static variable chaged by one of the object");
s1.collegename="BMS";
s1.display();
s2.display();
}
}
