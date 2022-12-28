public class Ques6{
public static void main(String[] args){

String str = "hello world";
try{
char ch = str.charAt(110);
System.out.println(ch);
}
catch(StringIndexOutOfBoundsException sioobe){
System.out.println("String Out Of range");
}
}
}