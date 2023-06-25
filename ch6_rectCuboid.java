class Rect {
   public int l, b,h;

    Rect(int l, int b,int h) {
        this.l = l;
        this.b = b;
        this.h =h;
        }

    int arearect() {
        return l * b*h;
    }

}

class CUBEOID extends Rect {
    int w;

    CUBEOID(int l, int b, int w) {
        super(l, b,w);
        this.w = w;

    }

    int volume() {
        return l * b * w;
    }
}

public class ch6_rectCuboid {
    public static void main(String[] args) {
        CUBEOID c = new CUBEOID(12, 3, 4);
        System.out.println("Volume of cuboid is "+c.volume());
        System.out.println("Area of Rectangle is "+c.arearect());
    }
}
