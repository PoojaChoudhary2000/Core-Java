public class Program15{
public static void main(String[] args){

for(int num=1;num<=100;num++){
	
	int prime =0;

	for(int i=2;i<=num-1;i++){
	if(num%i==0){
	prime++;
	}
	}
	if(prime==0){
	System.out.println(num);
	}
}
}
}