import java.util.*;
import java.text.*;

public class Main{

	public static void main(String[] args){

		Date date = new Date();
		System.out.println( "Using toString methord : "+ date.toString());

		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat(
					"E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date : "+ft.format(dNow));
		
		System.out.printf("%1$s %2$tB %2$td ,%2$tY","Due date",date);
	}
}
