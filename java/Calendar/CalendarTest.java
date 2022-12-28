import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class CalendarTest{
public static void main(String[] args){

String str = args[0];
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

Calendar c = Calendar.getInstance();
System.out.println(c.getTime());
System.out.println(c.get(Calendar.YEAR));
System.out.println(c.get(Calendar.MONTH));
System.out.println(c.get(Calendar.WEEK_OF_YEAR));


c.add(Calendar.YEAR,15);
c.add(Calendar.MONTH,15);

System.out.println(c.get(Calendar.YEAR));
}
}