public class AStar{

public static void main(String[]args){


for(int i=1;i<=5;i++){

	for(int k=5;k>=i;k--){
	
	System.out.print(" ");
	}
	for(int j=1;j<=i*2-1;j++){
	
	if(i+j==4||i*j==10){
	System.out.print("*");
	}
	else{
	System.out.print(" ");
	}
	
	}
System.out.println();
}
}
}