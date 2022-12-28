public class Poojach{

public static void main(String [] args){

int i;
int number=Integer.parseInt(args[0]);
int num=number;
int num1=number;
int sum=0;

for (i=0;number!=0;i++){
		number=number/10;
	
	}
int rem=0;
		while(num!=0){
					rem=num%10;
					
					int mul=1;		
				for (int j=1;j<=i;j++){

									mul=mul*rem;

				}
					sum=sum+mul;
					num=num/10;
		}
				if (num1==sum){
System.out.println("Given number is ArmStrong number");
		}
else{
System.out.println("Given number is not ArmStrong number");
}
}
}