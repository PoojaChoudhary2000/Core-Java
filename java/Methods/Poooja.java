public class Poooja{

public static void main(String[] args){

for (int k=1;k<=100;k++){
int sum=0;

for(int i=1;i<k;i++){
	if (k%i==0){
	sum=sum+i;

}

}
if (sum==k){
System.out.println(sum);
}
}
}
}