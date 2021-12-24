import java.io.*;
public class Main{
public static void main(String args[]) throws IOException{
 FileReader fr1=new FileReader("c:\\java\\aaa.txt");
 FileReader fr2=new FileReader("c:\\java\\bbb.txt");
 FileReader fr3=new FileReader("c:\\java\\ccc.txt");
 BufferedReader bfr1=new BufferedReader(fr1);
 BufferedReader bfr2=new BufferedReader(fr2);
 BufferedReader bfr3=new BufferedReader(fr3);
 String str;

 System.out.println("aaa.txt");
while((str=bfr1.readLine())!=null)
 System.out.println(str);

 System.out.println("\nbbb.txt");
while((str=bfr2.readLine())!=null)
 System.out.println(str);

 System.out.println("\nccc.txt");
 while((str=bfr3.readLine())!=null)
 System.out.println(str);

 fr1.close();
 fr2.close();
 fr3.close();
}
}

//aaa.txt
//Look before you leap.

//bbb.txt
//Make hay while the sun shines.

//ccc.txt
//Look before you leap.
//Make hay while the sun shines.
