import java.io.*;
public class Main{
public static void main(String args[]) throws IOException{
 char data[]=new char[128];
 FileReader fr=new FileReader("c:\\java\\donkey.txt");
 fr.skip(9);
 int num=fr.read(data);
 String str=new String(data,0,num);
 System.out.println("Characters read= "+num);
 System.out.println(str);
 fr.close();
}
}

//Characters read= 21
//我從來也不騎
//有一天我心血來潮騎著去趕集
