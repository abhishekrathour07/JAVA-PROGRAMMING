class MyEmployee {
    private int id;
    private String name;
    private int sallery;

    public int getid() {
        return id;
    }
    public void setid(int i) {
        this.id = i;
    }


    public String getname() {
        return name;
    }
    public void setname(String n) {
        this.name = n;
    }
}


public class ch6_gettersetter {

    public static void main(String[] args) {
        MyEmployee abhi = new MyEmployee();
        abhi.setid(101);
        System.out.println(abhi.getid());
        abhi.setname("Abhishek");
        System.out.println(abhi.getname());

    }

}
