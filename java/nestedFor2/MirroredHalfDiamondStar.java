public class MirroredHalfDiamondStar{

public static void main(String[] args){

for(int i=0; i<5; i++){

	for(int j=1; j<5-i; j++){

	System.out.print(" ");
	}

	for(int k=0; k<=i;k++){

	System.out.print("*");
	}
System.out.println();
}
for(int i=1; i<=5;i++){

	for(int j=1; j<=i-1; j++){
	
	System.out.print(" ");
	}
	for(int k=1; k<=5-i+1; k++){
	
	System.out.print("*");
	}
System.out.println();

}



}

}

