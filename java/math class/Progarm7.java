//Write a program to find the value of 25 raise to (power) 3

public class Progarm7{
public static void main(String[] args){

int num= Integer.parseInt(args[0]);
int pow= Integer.parseInt(args[1]);

double m =  Math.pow(num,pow);
System.out.println(m);

}
}