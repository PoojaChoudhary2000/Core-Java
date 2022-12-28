public class Program2Circle{
public static void main(String[] args){

Circle c = new Circle();
Circle c1 = new Circle(10 , "red");
Circle c2 = new Circle(20, "blue", 2.2);

int b = c1.getBorderWidth();
String co = c1.getColor();

int bw = c2.getBorderWidth();
String col = c2.getColor();
double r = c2.getRadius();

System.out.println(b);
System.out.println(co);
System.out.println();
System.out.println(bw);
System.out.println(col);
System.out.println(r);


}
}