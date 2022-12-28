//Write a program to add the values of an array

public class Program1{
public static void main(String[] args){

int[] arr ={10,20,30,40,50,60,70,80,90,100};
int sum=0;
for(int i=0;i<arr.length;i++){
	sum=sum+arr[i];
}
System.out.println(sum);
}
}