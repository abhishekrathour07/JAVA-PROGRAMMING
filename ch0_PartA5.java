public class ch0_PartA5 {
    int add() {
        return (10 + 10);
    }

    int add(int x, int y) {
        return (x + y);
    }

    float add(float a, float b) {
        return (a + b);
    }

    public static void main(String args[]) {
        ch0_PartA5 a = new ch0_PartA5();
        System.out.println("Using default values sum is:" + a.add());
        System.out.println("Using integer values sum is:" + a.add(30, 20));
        System.out.println("Using float values sum is:" + a.add(20.3f, 29.4f));
    }
}
