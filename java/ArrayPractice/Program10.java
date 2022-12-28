//Write a program to create a One D Array and insert Random Numbers

public class Program10{
public static void main(String[] args){

int[] arr = new int[50];

for(int i=0;i<arr.length;i++){
	arr[i] = (int) (Math.random()*50);
}

for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}