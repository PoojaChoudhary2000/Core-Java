import java.io.File;

public class FileInfo{
public static void main(String[] args){

File f = new File(args[0]);
	
	if(f.exists()){
	System.out.println(f.getName());
	System.out.println("This is a file : "+f.getName());
	}

}
}