//Write a program to find sum of first and last digit of a number.

public class Program9{

public static void main(String[] args){

int num = Integer.parseInt(args[0]);
int FD=0;
int LD=num%10;

while(num>9){
num= num/10;
}
System.out.println("FD : "+num);
System.out.println("LD : "+LD);
FD=num;
System.out.println(FD+LD+" : sum of firstdigit and lastdigit");
}
}