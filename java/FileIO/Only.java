import java.io.*;
import java.io.File;

public class Only{

public static void main(String[] args){


			File [] f = File.listRoots();

			for(File a:f){
				System.out.println(a);
				}


				File[] ff = f[0].listFiles();
			
				for(File fff:ff){

				
			System.out.println(fff);

				}

}
}