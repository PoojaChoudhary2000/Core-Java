class Shape{

public int borderWidth=0;
public String color=null;

Shape(){
}

Shape(int borderWidth, String color){
this.borderWidth=borderWidth;
this.color=color;
}

public void setBorderWidth(int borderWidth){
this.borderWidth=borderWidth;
}
public int getBorderWidth(){
return borderWidth;
}

public void setColor(String color){
this.color=color;
}
public String getColor(){
return color;
}

public double area(){
return 0.0;
}

public double perimeter(){
return 0.0;
}
}

class Circle extends Shape{

private double radious=0.0;

Circle(){
}

Circle(int borderWidth, String color){
this.borderWidth=borderWidth;
this.color=color;
}

Circle(int borderWidth, String color, double radious){
this.borderWidth=borderWidth;
this.color=color;
this.radious=radious;
}

public void setRadious(double radious){
this.radious=radious;
}
public double getRadious(){
return radious;
}

public double area(){
return 3.141*radious*radious;
}

public double circumference(){
return 2*3.141*radious;
}
}

class Rectangle extends Shape{

public int length=0;
public int width=0;

Rectangle(){
}

Rectangle(int borderWidth, String color){
this.borderWidth=borderWidth;
this.color=color;
}

Rectangle(int borderWidth, String color, int width, int length){
this.borderWidth=borderWidth;
this.color=color;
this.width=width;
this.length=length;
}

public void setLength(int length){
this.length=length;
}
public int getLength(){
return length;
}

public void setWidth(int width){
this.width=width;
}
public int getWidth(){
return width;
}

public double area(){
return length*width;
}

public double perimeter(){
return 2*length+width;
}
}

class Square extends Rectangle{

private int side=0;

Square(){
}

Square(int side){
this.side=side;
}

Square(int borderWidth, String color, int side){
this.borderWidth=borderWidth;
this.color=color;
this.side=side;
}

public void setSide(int side){
this.side=side;
}
public int getSide(){
return side;
}

public void setLength(int length){
this.length=length;
}
public int getLength(){
return length;
}

public void setWidth(int width){
this.width=width;
}
public int getWidth(){
return width;
}

public double area(){
return side*side;
}

public double perimeter(){
return 4*side;
}
}


public class TestShape{
public static void main(String[] args){

Shape s = new Shape();
Shape s1 = new Shape(10, "red");

int sbw = s1.getBorderWidth();
String sc = s1.getColor();
System.out.println(sbw + " "+ sc);


Circle c = new Circle();
Circle c1 = new Circle(1, "pink");
Circle c2 = new Circle(1, "pink", 10);

Rectangle r = new Rectangle();
Rectangle r1 = new Rectangle(2, "black");
Rectangle r2 = new Rectangle(2, "black", 10, 11);

Square sq = new Square();
Square sq1 = new Square(45);
Square sq2 = new Square(22, "orange", 45);
 
}
}






































