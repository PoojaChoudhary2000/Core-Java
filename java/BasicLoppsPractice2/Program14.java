public class Program14{
public static void main(String...args){

int num = Integer.parseInt(args[0]);
int prime=0;

for(int i=2;i<=num-1;i++){
	if(num%i==0){
	prime++;
	}
}
if(prime>0){
System.out.println(num+": is not a prime");
}
else{
System.out.println(num+": is a prime");
}
}
}
