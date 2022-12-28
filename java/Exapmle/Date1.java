import java.util.Date;
import java.text.SimpleDateFormat;

public class Date1{
public static void main(String[] args) throws Exception{

Date d = new Date();
System.out.println(d);

long time = d.getTime();
System.out.println(time);

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy   HH:mm:s");
String str = sdf.format(d);

System.out.println(str);

String dob = "16/07/2000   01:32:00";
Date d1 = sdf.parse(dob);
System.out.println(d1);
}
}