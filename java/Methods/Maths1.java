public class Maths1{

public static void fact(int a){
int fact=1;

for(int i=1;i<=a;i++){
fact=fact*i;
}
System.out.println(fact);
}

public static void main(String[] args){

int num= Integer.parseInt(args[0]);

fact(num);

}
}