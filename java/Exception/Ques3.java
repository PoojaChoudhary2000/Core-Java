public class Ques3{
public static void main(String[] args){

String s = null;

try{
System.out.println(s.length());
}
catch(NullPointerException npe){
System.out.println(" String is null");
}

}
}