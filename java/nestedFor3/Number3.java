public class Number3{

public static void main(String[] args){

for(int i=1;i<=5;i++){

	for(int j=1;j<=5;j++){
	
	if(j==3||j==1||j==5){
	System.out.print("0 ");
	}
	else if(j==2||j==4){
	System.out.print("1 ");
	}
	else{
	System.out.print(" ");
	}
	}
System.out.println();
}
}
}