public class Program1Shape{
public static void main(String[] args){

Shape s = new Shape();

Shape s1 = new Shape(10, "red");

int bw = s1.getBorderWidth();
String co = s1.getColor();

System.out.println(bw);
System.out.println(co);
}
}