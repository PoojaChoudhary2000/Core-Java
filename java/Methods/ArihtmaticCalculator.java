public class ArihtmaticCalculator{

//ADITION

public static void add1(int a,int b){
int sum = a+b;
System.out.println(sum);
}

public static void add2(int a,int b,int c){
int sum = a+b+c;
System.out.println(sum);
}

public static void add3(int a,int b,int c,int d){
int sum = a+b+c+d;
System.out.println(sum);
}

// SUBSTRACTION

public static void sub1(int a,int b){
int sub = a-b;
System.out.println(sub);
}

public static void sub2(int a,int b,int c){
int sub = a-b-c;
System.out.println(sub);
}

public static void sub3(int a,int b,int c,int d){
int sub = a-b-c-d;
System.out.println(sub);
}

//MULTIPLICATION

public static void mul1(int a,int b){
int mul = a*b;
System.out.println(mul);
}

public static void mul2(int a,int b,int c){
int mul = a*b*c;
System.out.println(mul);
}

public static void mul3(int a,int b,int c,int d){
int mul = a*b*c*d;
System.out.println(mul);
}

//DIVISION

public static void div1(double a,double b){
double div = a/b;
System.out.println(div);
}

public static void div2(double a,double b,double c){
double div = a/b/c;
System.out.println(div);
}

public static void div3(double a,double b,double c,double d){
double div = a/b/c/d;
System.out.println(div);
}

//RWMINDER

public static void rem(int a,int b){
int rem = a%b;
System.out.println(rem);
}

public static void main(String[] args){

//ADITION

if(args.length==2){
int n = Integer.parseInt(args[0]);
int n1 = Integer.parseInt(args[1]);
add1(n,n1);
}
else if(args.length==3){
int n = Integer.parseInt(args[0]);
int n1 = Integer.parseInt(args[1]);
int n2 = Integer.parseInt(args[2]);
add2(n,n1,n2);
}
else if(args.length==4){
int n = Integer.parseInt(args[0]);
int n1 = Integer.parseInt(args[1]);
int n2 = Integer.parseInt(args[2]);
int n3 = Integer.parseInt(args[3]);
add3(n,n1,n2,n3);
}

//SUBSTRACTION

if(args.length==2){
int n = Integer.parseInt(args[0]);
int n1 = Integer.parseInt(args[1]);
sub1(n,n1);
}
else if(args.length==3){
int n = Integer.parseInt(args[0]);
int n1 = Integer.parseInt(args[1]);
int n2 = Integer.parseInt(args[2]);
sub2(n,n1,n2);
}
else if(args.length==4){
int n = Integer.parseInt(args[0]);
int n1 = Integer.parseInt(args[1]);
int n2 = Integer.parseInt(args[2]);
int n3 = Integer.parseInt(args[3]);
sub3(n,n1,n2,n3);
}

//MULTIPLICATION

if(args.length==2){
int n = Integer.parseInt(args[0]);
int n1 = Integer.parseInt(args[1]);
mul1(n,n1);
}
else if(args.length==3){
int n = Integer.parseInt(args[0]);
int n1 = Integer.parseInt(args[1]);
int n2 = Integer.parseInt(args[2]);
mul2(n,n1,n2);
}
else if(args.length==4){
int n = Integer.parseInt(args[0]);
int n1 = Integer.parseInt(args[1]);
int n2 = Integer.parseInt(args[2]);
int n3 = Integer.parseInt(args[3]);
mul3(n,n1,n2,n3);
}

//DIVISION

if(args.length==2){
double n = Double.parseDouble(args[0]);
double n1 = Double.parseDouble(args[1]);
div1(n,n1);
}
else if(args.length==3){
double n = Double.parseDouble(args[0]);
double n1 = Double.parseDouble(args[1]);
double n2 = Double.parseDouble(args[2]);
div2(n,n1,n2);
}
else if(args.length==4){
double n = Double.parseDouble(args[0]);
double n1 = Double.parseDouble(args[1]);
double n2 = Double.parseDouble(args[2]);
double n3 = Double.parseDouble(args[3]);
div3(n,n1,n2,n3);
}

//REMINDER

if(args.length==2){
int n = Integer.parseInt(args[0]);
int n1 = Integer.parseInt(args[1]);
rem(n,n1);
}

if(args.length==1){
System.out.println("MUST ENTER TWO VALUES");
}
}
}