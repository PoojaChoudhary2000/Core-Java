//Write a program to check whether a number is even or odd by creating method of return type boolean ?

public class Program3{

public static boolean max(int a){

if(a%2==0){
System.out.println("num is even");
return true;
}
else{
System.out.println("num is odd");
return false;
}
}

public static void main(String[] args){

int num=Integer.parseInt(args[0]);

boolean z = max(num);
System.out.println(z);
}
}