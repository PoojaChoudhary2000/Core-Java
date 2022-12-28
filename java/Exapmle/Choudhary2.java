public class Choudhary2{
	
	String color;
	int age;
	
	public void initObj(String c, int a){
	color=c;
	age=a;
	}
	
	public void display(){
	System.out.println(color+" "+age);
	}
public static void main(String [] args){
	Choudhary2 buzo = new Choudhary2();
	buzo.initObj("black",10);
	buzo.display();
}
}