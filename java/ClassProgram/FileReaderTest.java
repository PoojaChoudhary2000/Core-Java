import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileIOException;

public class FileReaderTest{
public static void main(String[] args){

FileReader fr = null;
char ch;

try{
fr= newFileReader("c:/pooja.txt");
int i = fr.read();
int j = 0;

while(i!=-1){
ch = (char)i;
System.out.println(ch);
i = fr.read();
j++;
}
System.out.println("Loop execution : "+j);
}
catch(IOException ioe){
ioe.printStackTrace();
}
catch(IOException ioe){
ioe.printStackTrace();
}
}
}