import java.util.Date;
import java.util.SimpleDateFormat;

public class DateHandeling{
public static void main(String[] args) throws Exception{

Date d = new Date();
System.out.println(d);

long time = d.getTime();
System.out.println(time);

SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
String str = sdf.format(d);
System.out.println(str);

String dob = "15/08/1947";

Date d1 = sdf.parse(dob);
System.out.println(d1);

}
}