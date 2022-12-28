public class Program9{

public static void main(String[] args){

char ch='A';

for(int i=1;i<=5;i++){
	
	ch='A';
	
	for(int s=5;s>=i;s--){
	
	System.out.print("  ");
	}
	for(int j=1;j<=i*2-1;j++){
	
	System.out.print(ch + " ");
	ch++;
	}
	
System.out.println();
}
}

}