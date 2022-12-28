import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BikeDetails{
public static void main(String[] args){

String s = args[0];
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

System.out.println("Date of bike purchase : "+s);

Calendar c = Calendar.getInstance();
System.out.println("Registration date : "+c.getTime());

}
}