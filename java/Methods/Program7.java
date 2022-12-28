//. Write a program to check whether a character is uppercase or lowercase alphabet by creating method of return type boolean

public class Program7{
public static boolean max(char ch){

if(ch>='a' && ch<='z'){
System.out.println("given character is in lowercase");
return true;
}
else{
System.out.println("given character is in uppercase");
return false;
}
}
public static void main(String[] args){

boolean z = max('z');
System.out.println(z);
}
}