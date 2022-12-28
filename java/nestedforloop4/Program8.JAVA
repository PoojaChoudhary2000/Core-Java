//Write a program to find the first and last digit of a number.


public class Program8{

public static void main(String[] args){

int num = Integer.parseInt(args[0]);
int firstDigit = 0;
int lastDigit =num%10;

while(num>9){
num = num/10;
}
System.out.println("firstDigit = "+ num);
System.out.println("lastDigit = "+lastDigit);

}
}