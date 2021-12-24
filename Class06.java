import java.io.*;
public class Main{
public static void main(String args[]){
try{
 char data[]=new char[128];
 FileReader fr=new FileReader("c:\\java\\train.txt");

 int num=fr.read(data);
 String str=new String(data,0,num);
 System.out.println("Characters read= "+num);
 System.out.println(str);
 fr.close();
}
catch(IOException e){
}	
}	
}

//Characters read= 29
//火車快飛,火車快飛
//越過高山,飛過小溪
//不知走了幾百里
