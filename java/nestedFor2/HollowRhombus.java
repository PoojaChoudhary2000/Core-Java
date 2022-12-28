public class HollowRhombus{

public static void main(String[] aargs){

for(int i=1;i<=5;i++){

	for(int j=4;j>=i;j--){
	
	System.out.print(" ");
	}
	for(int k=1;k<=5;k++){
	
	if(i==5 || i==1 || k==1 || k==5){

	System.out.print("*");
	}
	else{
	System.out.print(" ");}
	}
System.out.println();
}
}
}