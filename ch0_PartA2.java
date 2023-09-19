import java.util.Calendar;

public class ch0_PartA2 {
    public static void main(String args[]) {
        Calendar cal = Calendar.getInstance();
        String month[] = { "Jauary", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        System.out.println("Current month=" + month[cal.get(Calendar.MONTH)]);
    }
}
