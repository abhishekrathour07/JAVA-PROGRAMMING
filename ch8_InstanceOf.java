public class ch8_InstanceOf {
    public static void main(String[] args) {
        String s = "abhishek";
        boolean b = s instanceof String;
        ch8_InstanceOf i = new ch8_InstanceOf();
        boolean b1 = i instanceof ch8_InstanceOf;
        
        System.out.println(b1);
        System.out.println(b);
    }
}
