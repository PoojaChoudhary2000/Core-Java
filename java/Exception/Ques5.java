public class Ques5{
public static void main(String[] args){

int arr[] = new int[5];

arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;

try{

for(int i=0;i<=arr.length;i++){
System.out.println(arr[i]);
}

System.out.println(arr[5]);
}
catch(ArrayIndexOutOfBoundsException aioobe){
System.out.println("can't insert more than 5 elemrnts in arry");
}
}
}