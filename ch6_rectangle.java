class rect{
    private int l,b;
    public rect(){
        this.l =6;
        this.b =5;
    }
    public rect(int l,int b){
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
        rect c =new rect();
        System.out.println(c.getinarea());
    }
}
