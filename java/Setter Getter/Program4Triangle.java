public class Program4Triangle{
public static void main(String[] args){

Triangle t = new Triangle();

t.setBorderWidth(10);
t.setColor("red");
t.setBase(20);
t.setHeight(30);

int bw = t.getBorderWidth();
String co = t.getColor();
int b = t.getBase();
int h = t.getHeight();

System.out.println("BorderWidth : "+bw);
System.out.println("Color : "+co);
System.out.println("Base : "+b);
System.out.println("Height : "+h);
}
}
