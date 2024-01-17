import java.text.SimpleDateFormat;

public class DateFormat{
    public static void main(String[] args) {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String Date = sdf.format(new java.util.Date());
        System.out.println(Date);
    }
}