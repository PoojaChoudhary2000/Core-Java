public class Program2Circle{
public static void main(String[] args){

Circle c = new Circle();

c.setBorderWidth(10);
c.setColor("red");
c.setRadious(10.5);

int bw = c.getBorderWidth();
String co =c.getColor();
double r = c.getRadious();

System.out.println("BorderWidth : "+ bw);
System.out.println("Color : "+ co);
System.out.println("Radious : "+ r);
System.out.println("Area : "+Math.PI*r*r);
System.out.println("Circemference : "+2*Math.PI*r);



}
}