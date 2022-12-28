public class FindPowerOfAnyNum{
public static void main(String[] args){


int num = 2;
int pow = 2;
int ans = 1;

while(pow!=0){

ans=ans*num; //1*1=2
pow--;			//1
}

System.out.println(ans);
}
}