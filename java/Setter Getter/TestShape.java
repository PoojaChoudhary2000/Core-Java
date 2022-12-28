public class TestShape{
public static void main(String [] args){


shape s = new shape();	// s is an object here

s.setColor("red");
s.setBorderWidth(10);

String col = s.getColor();
int bw = s.getBorderWidth();

System.out.println(s.getColor());
System.out.println(bw);

shape s1=new shape();

s1.setColor("green");
s1.setBorderWidth(20);



System.out.println(s.getColor());
System.out.println(s.getBorderWidth());
System.out.println(s1.getColor());
System.out.println(s1.getBorderWidth());

}
}