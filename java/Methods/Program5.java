//Write a program to check whether a character is alphabet or not by creating method of return type boolean

public class Program5{
public static boolean ch(char c){

if(c>='a' && c<='z'){
System.out.println("character is alphabet");
return true;
}
else{
System.out.println("chatacter is not a alphabet");
return false;
}
}

public static void main(String[] args){

boolean z = ch('*');
System.out.println(z);
}
}