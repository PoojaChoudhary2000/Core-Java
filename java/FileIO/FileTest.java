import java.io.File;

public class FileTest{
public static void main(String[] args){


File folder = new File("c:/Windos");

File[] files = folder.listFiles();

int i =1;
int j = 1;
for(File f : files){

if(f.isFile()){
System.out.println("File --> "+f.getName()+"  --  "+i);
System.out.println();
i++;
}
else if(f.isDirectory()){
System.out.println("Folder : "+f.getName()+"  --  "+j);
System.out.println();
j++;
}
}
}
}