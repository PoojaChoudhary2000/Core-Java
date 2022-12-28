public class example{
public static void main(String[] args){

int n;
int sum;
//int num=Integer.parseInt(args[0]);
for( n=1; n<=2000000;n++){
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