import java.io.*;
import java.lang.NullPointerException;

public class SystemFiles{

static int file = 0;
static int folder = 0;

public static void main(String[] args){

System.out.println("main method Starting");

File[] drive = File.listRoots();


try{
for(File d:drive){
File[] x = d.listFiles();

for(File b : x){
if(b.isFile()){
file++;
//System.out.println(b);
}
if( b.isDirectory()){
folder++;
//System.out.println(b);
inside(b);
}
}
System.out.println("Total drive in this system ------------>"+drive.length);
System.out.println("Total file in this system ------------>"+file);
System.out.println("Total folder in this system ------------>"+folder);
}

}

catch(NullPointerException npe){}
}


public static void inside(File f){

try{

File[] ff= f.listFiles();

for(File z : ff){
if(z.isFile()){
file++;
}
else if(z.isDirectory()){
folder++;

inside(z);
}
}
}catch(NullPointerException npe){}

}
}

