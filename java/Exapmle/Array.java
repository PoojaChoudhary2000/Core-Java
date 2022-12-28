public class Array{
public static void main(String[] args){

int[] a = {0,2,4,1,3};

for(int i=1;i<a.length;i++){
	a[i]=a[ (a[i] + 3)% a.length];
}
System.out.println(a[1]);
//System.out.println(a[1]);
//System.out.println(a[2]);
//System.out.println(a[3]);
//System.out.println(a[4]);
}
}