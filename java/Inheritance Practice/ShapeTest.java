class Shape{

	public int borderWidth=0;
	public String color=null;

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
}

class Rectangle extends Shape{

	private int width=0;
	private int length=0;
	
	public void setWidth(int width){
	this.width=width;
	}
	public int getWidth(){
	return width;
	}
	public void setLength(int length){
	this.length=length;
	}
	public int getLength(){
	return length;
	}
	public int area(){
	return length*width;
	}
	public int peremeter(){
	return 2*length+width;
	}	
}

class Triangle extends Shape{

	private int base=0;
	private int height=0;

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
	public void setHeight(int height){
	this.height=height;
	}
	public int getHeight(){
	return height;
	}
	public void setBase(int base){
	this.base=base;
	}
	public int getBase(){
	return base;
	}
	public int area(){
	return 1/2*base*height;
	}
}

class Circle extends Shape{

	private double radious=0.0;
	
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


public class ShapeTest{
	public static void main(String[] args){

	Shape s = new Shape();

	s.setColor("red");
	s.setBorderWidth(10);
	String c = s.getColor();
	int b = s.getBorderWidth();
	System.out.println(c);
	System.out.println(b);
	
	Rectangle r = new Rectangle();
	
	r.setLength(20);
	r.setWidth(30);
	int l = r.getLength();
	int w = r.getWidth();
	
	Triangle t = new Triangle();
	
	t.setHeight(11);
	t.setBase(22);
	int h =t. getHeight();
	int ba =t. getBase();	
	
	Circle ci = new Circle();
	
	ci.setRadious(40); 
	double ra = ci.getRadious();
	System.out.println(ra);	
	ci.getBorderWidth();
	System.out.println(ci.getBorderWidth());
	
	}
}
