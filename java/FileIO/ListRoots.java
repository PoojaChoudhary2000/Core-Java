import java.io.File;

public class ListRoots{
public static void main(String[] args){

java.io.File[] folder = java.io.File.listRoots();

int i =0;
for(java.io.File ff : folder){
if(ff.isDirectory()){
System.out.println();
i++;
System.out.println("Total Drive in this System : "+i);
}
}

}
}