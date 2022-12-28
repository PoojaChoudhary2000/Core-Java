//Write a program to print Fibonacci series up to 100 terms.

public class Program18{
public static void main(String[] args){

int n1 = -1;
int n2 = 1;
int sum;

for(int i=1;i<=100;i++){
sum = n1 + n2 ;
System.out.println(sum +" ");
n1 = n2;
n2 = sum;
}
}
}

