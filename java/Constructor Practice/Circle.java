public class Circle{

private int borderWidth = 0;
private String color = null;
private double radius = 0.0;

public Circle(){

}
public Circle(int borderWidth, String color){
this.borderWidth=borderWidth;
this.color=color;
}
public Circle(int borderWidth, String color, double radius){
this.borderWidth=borderWidth;
this.color=color;
this.radius=radius;
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

public void setRadius(double radius){
this.radius=radius;
}
public double getRadius(){
return radius;
}
}