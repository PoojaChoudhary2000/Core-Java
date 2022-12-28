public class Number38{
public static void main(String[] args){

for(int i=1;i<=5;i++){
	for(int j=1;j<=i;j++){
	if(i==j||i==5||i+j==3||i+j==4||i*j==4){
	System.out.print("1"+" ");
	}
	else{
	System.out.print("0"+" ");
	}
	}
System.out.println();
}
}
}