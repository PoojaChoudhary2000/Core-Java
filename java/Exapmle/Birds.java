class Birds{

	void eat(){
	System.out.println("I am eating");
	}
}

class Sparrow extends Birds{

	public static void main(String[] args){
	Birds sp = new Birds();
	sp.eat();
	}
}