class rect1{
    private int l,b;
    public rect1(){
        this.l =6;
        this.b =5;
    }
    public rect1(int l,int b){
        this.l =l;
        this.b =b;
    }
    public int getterl(){
        return l;
      
    }
    public int getterb(){
        return b;
    }
    public int getinarea(){
        return l*b;
    }
}
public class ch6_rectangle {
    public static void main(String[] args) {
        rect1 c =new rect1(7,8);
        System.out.println(c.getinarea());
    }
}
