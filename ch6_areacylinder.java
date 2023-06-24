class cylinder {
    int radius, height;

    public void setradius(int radius) {
        this.radius = radius;
    }

    public int getradius() {
        return radius;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public int getheight() {
        return height;
    }

    public double surfacearea() {
        return 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
    }

    public double volume() {
        return 3.14 * radius * radius * height;
    }
}

public class ch6_areacylinder {
    public static void main(String[] args) {
        cylinder cyl = new cylinder();
        cyl.setheight(4);
        cyl.setradius(5);
        System.out.println("Height = " + cyl.getheight());
        System.out.println("Radius = " + cyl.getradius());
        System.out.print("Surface area of cylinder is : ");
        System.out.println(cyl.surfacearea());
        System.out.print("Volume of cylinder is : ");
        System.out.println(cyl.volume());

    }
}
