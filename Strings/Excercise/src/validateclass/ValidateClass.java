package validateclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {

    public static void main(String[] args) {

        try {
            String c1 = "C0318G";
            String c2 = "C0318G";
            String c3 = "C0323K";
            String c4= "C0323A";

            String regex = "^[CAP]\\d{4}[G-K]$";

            Pattern pattern = Pattern.compile(regex);
            Matcher m1 = pattern.matcher(c1);
            Matcher m3 = pattern.matcher(c3);
            Matcher m2 = pattern.matcher(c2);
            Matcher m4 = pattern.matcher(c4);

            boolean matcher1 = m1.matches();
            boolean matcher2 = m2.matches();
            boolean matcher3 = m3.matches();
            boolean matcher4 = m4.matches();

            System.out.println("Match1 = " + matcher1);
            System.out.println("Match2 = " + matcher2);
            System.out.println("Match3 = " + matcher3);
            System.out.println("Match4 = " + matcher4);

        } catch (Exception e) {
            throw  new RuntimeException(e);
        }

    }

}
