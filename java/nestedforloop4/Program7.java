public class Program7{

public static void main(String[] args){

int count = 0;
int num = 123456;

while(num>0){
num = num/10;
count++;
}
System.out.print(count);
}
}