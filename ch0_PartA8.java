import java.util.Scanner;

class student2 {
    String eid;
    String name;
    int s1, s2, s3, total;
    Scanner sc = new Scanner(System.in);

    public void getinfo() {
        System.out.println("Enter the student details");
        System.out.println("Enter the Employee id of student");
        eid = sc.nextLine();
        System.out.println("Enter the name of employee");
        name = sc.nextLine();
        System.out.println("Enter the marks of sub1, sub2 ,sub 3");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        if (s1 >= 50 && s2 >= 50 && s3 >= 50) {
            total = s1 + s2 + s3;
        } else {
            total = 0;
        }
    }

    student2() {
        getinfo();
    }

    public void displayinfo() {

        System.out.println(eid + "\t" + name + "  " + total);
    }
}

public class ch0_PartA8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of student");
        int n = sc.nextInt();
        student2 s[] = new student2[n];
        int i;
   
        for (i = 0; i < n; i++) {
            s[i] = new student2();
        }

        System.out.println("Student detail are \n");
        System.out.println("Id\t Name\t Total");
        for (i = 0; i < n; i++) {
            s[i].displayinfo();
        }
    }

}
