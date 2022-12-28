public class Ppooja{
public static void main(String[] args){

int[][] arr = new int[5][5];
int k=1;

for(int i=0;i<arr.length;i++){
	for(int j=0;j<arr[i];j++){
	arr[i][j]=++k;
	}
}

//printing logic

for(int i=0;i<arr.length;i++){
	for(int j=0;j<arr[i];j++){
	System.out.print(arr[i][j]+"\t");
	}
}
System.out.println();
}
}