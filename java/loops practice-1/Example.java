public class Example{
public static void main(String[] args){

int num = Integer.parseInt(args[0]); 
int pow = Integer.parseInt(args[1]); 
int res = 1;

while(pow!=0){
res*=num;
--pow;
}
System.out.println(res);
}
}



