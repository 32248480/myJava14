import java.util.Scanner;
import java.lang.String;
public class Main{
public static void main(String args[]){
 Scanner scn=new Scanner(System.in);
 String str;

 System.out.print("輸入字串:");
 str=scn.nextLine();

 System.out.println("轉換成大寫: "+str.toUpperCase());
}
}

//輸入字串:Knowldege is power.
//轉換成大寫: KNOWLDEGE IS POWER.