public class Arithmetic{

public static int add(int a, int b){
int sum = a+b;
return sum;
}

public static int sub(int a,int b){
int sub = a-b;
return sub;
}

public static double mul(double a,double b){
double mul = a*b;
return mul;
}

public static double div(double a,double b){
double div = a/b;
return div;
}

public static void main (String[] args){

int n = Integer.parseInt(args[0]);
int n1 = Integer.parseInt(args[1]);

int z = add(n,n1);
System.out.println("add : "+z);

int y = sub(n,n1);
System.out.println("subtract : "+y);

double x = mul(n,n1);
System.out.println("multiply : "+x);


double p = div(n,n1);
System.out.println("divide : "+p);

}
}