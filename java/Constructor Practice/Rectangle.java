public class Rectangle{

private int borderWidth = 0;
private String color = null;
private int width = 0;
private int length = 0;

public Rectangle(){
}

public Rectangle(int borderWidth, String color){
this.borderWidth=borderWidth;
this.color=color;
}

public Rectangle(int borderWidth, String color, int width, int length){
this.borderWidth=borderWidth;
this.color=color;
this.width=width;
this.length=length;
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

public void getWidth(int Width){
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
}