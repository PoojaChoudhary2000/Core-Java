public class Harmnic{
public static void main(String[] args){

double num=Double.parseDouble(args[0]);

double d=2, st=5;

for(double i=0;i<num;i++){
System.out.println(1/(st+d*i));
}
}
}