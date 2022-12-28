//Write a program to swap first and last digits of a number.

public class Program10{
public static void main(String[] args){

int num= Integer.parseInt(args[0]);
int FD=0;
int LD=num%10;

while(num>9){
num= num/10;
}
System.out.println("FirstDigit : "+num);
System.out.println("LastDigit : "+LD);
LD=num;
System.out.println(LD);
}
}