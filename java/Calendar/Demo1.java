import java.util.Calendar;

public class Demo1{
public static void main(String[] args){

Calendar c = Calendar.getInstance();
System.out.println(c.getMaximum(Calendar.WEEK_OF_YEAR));
System.out.println(c.getMaximum(Calendar.YEAR));


}
}