public class Program17{
public static void main(String[] args){

int n;
int sum;

for( n=1; n<=1000;n++){ 
sum =0;
for(int i=1;i<=n/2;i++){    
	if(n%i==0){
	sum=sum+i;
	}
}
if(n==sum){
System.out.println("perfect number = " + n);
}
}


}
}