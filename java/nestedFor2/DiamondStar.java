public class DiamondStar{

public static void main(String[] args){

int m=5;

for(int i=1;i<=4;i++){

	for(int j=5;j>=i;j--){

	System.out.print(" ");
	}
for(int l=1;l<=2*i-1;l++){

	System.out.print("*");
	}
	
System.out.println();
}
for(int i=1;i<=5;i++){

	for(int j=1;j<=i;j++){
	
	System.out.print(" ");
	}
	for(int k=9;k>=2*i-1;k--){

	System.out.print("*");
	}
System.out.println();
}
}
}

