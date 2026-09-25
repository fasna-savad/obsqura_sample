package excel_read;

import java.io.IOException;

public class Excel_Main {
	
	public static void main(String[] args) throws IOException {

	    String s = Excel_Code.readStringData(1, 0);
	    System.out.println(s);

	    String s1 = Excel_Code.readIntegerData(1, 1);
	    System.out.println(s1);
	}



}
