class staff
{
    String name,phoneno;
    int id,salary;
    public staff(int id,String name,int salary, String phoneno)
    {
        this.salary=salary;
        this.phoneno=phoneno;
        this.id=id;
        this.name=name;
    }
   public  staff(int id,String phoneno)
    {
        this.id=id;
        this.phoneno=phoneno;
    }
    public staff(String name,int salary,String phoneno)
    {
        this.name=name;
        this.salary=salary;
        this.phoneno=phoneno;
    }
    public staff(int id,String name,String phoneno)
    {
        this.id=id;
        this.name=name; 
        this.phoneno=phoneno;
    }
    public void display()
    {
        System.out.println(id+"\t\t"+name+"\t\t"+salary+"\t\t"+phoneno);
    }
}
public class ch14_Const{
    public static void main(String[] args) {
          System.out.println("id\t\tname\t\tsalary\t\tphoneno");
        staff s=new staff(1,"ram",1000,"95724397");
        s.display();
        staff s1=new staff(2,"9572439");
        s1.display();
        staff s2=new staff("shyam",20000,"9572439");
        s2.display();
        staff s3=new staff(3,"10000","95724397");
        s3.display();
        
    }
    
}