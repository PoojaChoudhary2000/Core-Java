//Write a program to find maximum between two numbers by creating method of return type int or double

public class Program1{

public static int max(int a,int b){

	if(a>b){
	System.out.println(a+" is max");
	return a;
	}
	else{
	System.out.println(a+" is max");
	return b;
	
	}
	}
public static void main(String[] args){

int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);

int z = max(n1,n2);
System.out.println(z);
}
}