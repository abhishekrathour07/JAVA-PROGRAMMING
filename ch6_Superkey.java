class circle {
    int r;

    circle(int r) {
        this.r = r;
    }

    float areacircle() {
        return (float) (Math.PI * r * r);
    }
}

class Cylinder extends circle {
    int h;

    Cylinder(int r, int h) {
        super(r);
        this.h = h;
     
    }

    float volume() {
        return (float) (Math.PI * r * r * h);
    }

}

public class ch6_Superkey {
    public static void main(String[] args) {
            Cylinder c =new Cylinder(4, 5);

            System.out.println("Volume of cylinder is "+c.volume());
            System.out.println("Area of circle is " +c.areacircle());

    }
}
