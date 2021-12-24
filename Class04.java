//(a),
import java.io.*;
public class Main{
public static void main(String args[]) throws IOException{
 char data[]=new char[128];
 FileReader fr=new FileReader("c:\\Java\\donkey.txt");
 
 int num=fr.read(data);
 String str=new String(data,0,num);
 System.out.println("Characters read= "+num);
 System.out.println(str);

 fr.close();
}
}

//Characters read= 30
//我有一隻小毛驢
//我從來也不騎
//有一天我心血來潮騎著去趕集

//(b),
//因為在Windows之中,Java會將換行字元「\r\n」看成是兩個字元,如下:
//我有一隻小毛驢\r\n(1 2 3 4 5 6 7 8 9)
//我從來也不騎\r\n(10 11 12 13 14 15 16 17)
//有一天我心血來潮騎著去趕集(18 19 20 21 22 23 24 25 26 27 28 29 30)
