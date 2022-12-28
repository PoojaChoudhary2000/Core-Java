import java.io.File;

public class Drives{
public static void main(String[] args){

File f = new File("c:/java");

String[] FAFN = f.list();
System.out.println(FAFN);

for(String str: FAFN){
System.out.println(str);
}
System.out.println(f.length());
}
}