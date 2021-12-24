import java.io.*;
public class Main{
public static void main(String args[]) throws IOException{
 FileReader fr1=new FileReader("C:\\Users\\user\\eclipse\\aaa.txt");
 FileReader fr2=new FileReader("C:\\Users\\user\\eclipse\\bbb.txt");
 FileWriter fw=new FileWriter("C:\\Users\\user\\eclipse\\ccc.txt");
 BufferedReader bfr1=new BufferedReader(fr1);
 BufferedReader bfr2=new BufferedReader(fr2);
 BufferedWriter bfw=new BufferedWriter(fw);
 String str;

while((str=bfr1.readLine())!=null){
 bfw.write(str);
 bfw.newLine();
}

 while((str=bfr2.readLine())!=null){
 bfw.write(str);
 bfw.newLine();
}

 bfw.flush();
 fw.close();
 fr1.close();
 fr2.close();
}
}