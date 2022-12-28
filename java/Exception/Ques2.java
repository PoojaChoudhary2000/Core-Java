public class Ques2{
public static void main(String[] args){

try{
String str = args[0];
System.out.println(str);
}
catch(ArrayIndexOutOfBoundsException aioobe){
System.out.println("please inter some value");
}
}
}