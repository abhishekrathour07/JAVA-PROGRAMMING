public class ch5_varargs {
    
     static int sum(int ...array){
        int cal =0 ;
      int  result = cal + array;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum of a and b is " + sum(3, 4));
        System.out.println("Sum of a , b and c is " + sum(3, 4, 4));
        System.out.println("Sum of a ,b ,c and d is " + sum(3, 4, 6, 8));

    }
    
}
