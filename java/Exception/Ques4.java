public class Ques4{
public static void main(String[] args){

String s = "gvdsyufur";
try{
int i = Integer.parseInt(s);
System.out.println(s);
}
catch(NumberFormatException nfe){
System.out.println("String can't be convet into integer");
}
}
}