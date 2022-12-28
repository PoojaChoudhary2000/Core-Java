public class Program3Rectangle{
public static void main(String[] args){

Rectangle r = new Rectangle();

r.setBorderWidth(10);
r.setColor("red");
r.setWidth(20);
r.setLength(30);

int bw =r.getBorderWidth();
String c=r.getColor();
int w = r.getWidth();
int l = r.getLength();
int p = l+w+l+w;

System.out.println("BorderWidth : "+bw);
System.out.println("Color : "+c);
System.out.println("Width : "+w);
System.out.println("Length : "+l);
System.out.println("Area : "+l*w);
System.out.println("Perimeter : "+p );



}
}