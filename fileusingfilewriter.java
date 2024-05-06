import java.io.*;

class CreateFile1
{
public static void main(String args[]) 
throws IOException
{
//take a string
String str="This is a book on Java."+"\nIam a learner of Java.";

//attach file to Filewriter 
Filewriter fw = new Filewriter("text");

//read character wise from string and write into Filewriter 
for(int i=0; i<str.length(); i++) 
   fw.write(str.charAt(1));

//close the file 
fw.close();

}

}
