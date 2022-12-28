public class Program3Rectangle{
public static void main(String[] args){

Rectangle r = new Rectangle();

Rectangle r1 = new Rectangle(10, "red");

Rectangle r2 = new Rectangle(40, "blue", 20, 30);

int b = r1.getBorderWidth();
String c = r1.getColor();

int bw = r2.getBorderWidth();
String co = r2.getColor();
int w = r2.getWidth();
int l = r2.getLength();

System.out.println(b);
System.out.println(c);
System.out.println();
System.out.println(bw);
System.out.println(co);
System.out.println(w);
System.out.println(l);

}
}