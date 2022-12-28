public class Program4{
public static void main(String[] args){

int num=Integer.parseInt(args[0]);
if(num>0){
System.out.println("Given number is positive");
}
else if(num<0){
System.out.println("Given number is negative");
}
else{
System.out.println("Given number is zero");
}
}
}