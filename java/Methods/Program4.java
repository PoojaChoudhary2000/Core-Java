//Write a program to check whether a year is a leap year or not by creating method of return type boolean

public class Program4{

public static boolean year(int a){

if(a%4==0){
System.out.println("leap year "+a);
return true;
}
else{
System.out.println("not a leap year "+a);
return false;
}
}


public static void main(String[] args){

int yr=Integer.parseInt(args[0]);

boolean z = year(yr);
System.out.println(z);
}
}