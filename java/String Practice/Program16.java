public class Program16{
public static void main(String[] args){
String str = "Java is a programming language and it is easy to learn";
String rev ="";
System.out.println(str);

for(int i=str.length()-1;i>=0;i--){

	rev=rev+str.charAt(i);
}
	if(str.equals(rev)){
	
	System.out.println("String is palindrome");
	}
	else{
	System.out.println("String is not a palindrome");
	}

}

}