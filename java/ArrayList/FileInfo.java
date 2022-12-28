import java.util.File;

public class FileInfo{
public static void main(String[] args){

String folderPath = "C:\";

File folder = new File(folderPath);

File[] files = folder.listFiles();

	for(File f : files){
		if(f.isFile()){
		System.out.println("Files : "+ f.getName());
		}
		else
			if(f.isDirectry){
			System.out.println("Folders"+f.getName());
			}
		
	}



}
}