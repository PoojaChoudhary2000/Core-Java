public class Shape{
public static void main(String[] args){

Shape s = new Shape();
try{
Circle c =(Circle)s;
}
catch(ClassCastException cce){
System.out.println("parent class can't inherit child class"  );
}
}
}
class Circle extends Shape{

}