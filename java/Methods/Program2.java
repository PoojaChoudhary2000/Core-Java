//Write a program to check whether a number is negative, positive or zero by creating method of return type String


public class Program2{

public static String max(int a){
if(a>0){

return "given num is positive";
}
else if(a<0){

return "given num is negative";
}
else{

return "given num is zero";
}
}

public static void main(String[] args){

int num=Integer.parseInt(args[0]);

String z = max(num);
System.out.println(z);
}
}