public class Program1{

public static void main(String[] args){

String S = "Java is a programming language and it easy to learn";

String R =" ";

for(int i=S.length()-1;i>=0;i--){

	R=R+S.charAt(i);
}
System.out.println("Origiinal string:"+S );

System.out.println("Reverse of string:"+R );
}
}