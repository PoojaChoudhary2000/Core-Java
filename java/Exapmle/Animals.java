public class Animals{
public static void main(String[] args){

Animals buzo=new Animals();
	buzo.eat();
	buzo.run();
	buzo.bark();

Birds sp = new Birds();
	sp.fly();
	sp.sing();
}
public void eat(){
System.out.println("I am eating ");
}

public void run(){
System.out.println("I am running");
}

public void bark(){
System.out.println("I am barking \n");
}
}

class Birds{

public void fly(){
System.out.println("I am flying");
}
public void sing(){
System.out.println("I am Singing");
}
}