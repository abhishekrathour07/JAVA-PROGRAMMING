class mycylinder {
    private int radius, height;
    // private int  a;
    public mycylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    // public mycylinder(int radius, int height,int a) {
    //     this.radius = radius;
    //     this.height = height;
    //     this.a =a;----->Example to know the constructor very well
    // }
    public double surfacearea() {
        return 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
    }

    public double volume() {
        return 3.14 * radius * radius * height;
    }
}

public class ch6_cylconstructer {
    public static void main(String[] args) {
            mycylinder c =new mycylinder(5,4 );
            System.out.println(c.volume());
            System.out.println(c.surfacearea());
    }
}
