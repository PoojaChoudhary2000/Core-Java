//Write a program to calculate the average value of array

public class Program2{
public static void main(String[] args){

int[] arr={10,20,30,40,50};
int sum=0;

for(int i=0;i<arr.length;i++){
	sum=sum+arr[i]/arr.length;
}
System.out.println(sum);
}
}