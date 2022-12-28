//Write a program to check whether an alphabet is vowel or consonant by creating method of return type boolean?

public class Program6{
 
public static boolean max(char c){

if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
System.out.println("character is a vowel");
return true;
}
else{
System.out.println("character is not an vowel");
return false;
}
}
public static void main(String[] args){

boolean z = max('b');
System.out.println(z);

}
}