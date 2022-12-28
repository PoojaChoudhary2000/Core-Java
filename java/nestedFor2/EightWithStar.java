public class EightWithStar{

public static void main(String[] args){

int r=9, c=5;

for(int i=1;i<=r;i++){
	
	for(int j=1;j<=c;j++){
	
	if(i==1||i==5||j==1||j==5||i==9){

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