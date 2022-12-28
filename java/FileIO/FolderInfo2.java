import java.io.*;

public class FolderInfo2{
public static void main(String[] args){

File f = new File(args[0]);

String[] FileAndFolderName = f.list();

for(String str : FileAndFolderName){
System.out.println(str);
}
System.out.println("       ");
int fileCount = f.list().length;
System.out.println("File Count : "+ fileCount);

long l = f.length();
System.out.println(l);


}
}