import java.util.Date;
import java.text.SimpleDateFormat;

public class abc123{
public static void main(String[] args) throws Exception{

SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

long d1 = Long.parseLong(args[0]);

System.out.println(d1);

}
}