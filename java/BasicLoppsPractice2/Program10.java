public class Program10{
public static void main(String[] args){

int num=1936;
int count=0;

while(num>0){
num=num/10;
count++;
}
System.out.println("Number of digits in a number = "+count);
}
}