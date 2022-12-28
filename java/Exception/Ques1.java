public class Ques1{
public static void main(String[] args){

int a = 50;
int b = 0;
try{
int div = a/b;
System.out.println(div);
}
catch(ArithmeticException ae){
System.out.println("can't divide by zero");
}
}
}