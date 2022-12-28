
 
import java.io.File;
public class DirFileCounter {
  public static void main(String args[]){
    File directory=new File("c:/java/ArrayList");
    int fileCount=directory.list().length;
    System.out.println("File Count:"+fileCount);
  }
}