import java.io.*;
public class Main{
public static void main(String args[]) throws IOException{
 int count=0;
 String str;
 FileReader fr=new FileReader("c:\\java\\donkey.txt");
 BufferedReader bfr=new BufferedReader(fr);

while((str=bfr.readLine())!=null){
if(count==1)
 bfr.skip(14);
 System.out.println(str);
 count++;
}
 fr.close();
}
}

//我有一隻小毛驢
//我從來也不騎
