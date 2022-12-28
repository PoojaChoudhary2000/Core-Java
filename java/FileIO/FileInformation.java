import java.io.*;
import java.lang.NullPointerException;

public class FileInformation{

static int file=0;
static int folder=0;

public static void main(String[] args){

System.out.println("Main method Entry");

	File [] drive = File.listRoots();

try{
	
	for(File d:drive){

					File [] x = d.listFiles();
	
					for(File b:x){
			

			
						if(b.isFile()){
							file++;	
					//System.out.println(b);
							
						}
						if(b.isDirectory()){
							folder++;
							//	System.out.println(b);
							inside(b);
							}
			}
}			

System.out.println("Total Drives in this System   --->>     "+drive.length);
			System.out.println("Total Files In this System ---->>    "+file);
			System.out.println("Total Folders in this System   --->>   "+folder);
}
catch(NullPointerException npe){}
}
	public static void inside(File f){
			
			try{	
			File[] ff = f.listFiles();

				for(File z:ff){

					if(z.isFile()){
						file++;
						}
					else if(z.isDirectory()){
						folder++;
						inside(z);
						}
	
				}

}
catch(NullPointerException npe){}

		}


}