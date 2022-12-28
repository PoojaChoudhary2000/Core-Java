public class Triangle{

private int borderWidth = 0;
private String color = null;
private int base = 0;
private int height = 0;

public Triangle(){

}

public Triangle(int borderWidth, String color){
this.borderWidth=borderWidth;
this.color=color;
}

public Triangle(int borderWidth, String color, int base, int height){
this.borderWidth=borderWidth;
this.color=color;
this.base=base;
this.height=height;
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

public void setBase(int base){
this.base=base;
}
public int getBase(){
return base;
}

public void setHeight(int height){
this.height=height;
}
public int getHeight(){
return height;
}
}