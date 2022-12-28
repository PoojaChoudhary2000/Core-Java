import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Details1{
public static void main(String[] args) throws Exception{

String str = args[0];
Date d = new Date();

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/y");

Date d1 =  sdf.parse(str);

Calendar c = Calendar.getInstance();

int day = c.get(Calendar.DAY_OF_MONTH);
int month = c.get(Calendar.MONTH);
int year = c.get(Calendar.YEAR);

System.out.println(day+"/"+month+"/"+year);


}
}