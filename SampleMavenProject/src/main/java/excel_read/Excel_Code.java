package excel_read;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Code {
	static FileInputStream f;  //to read the excelfile from our system 
    static XSSFWorkbook w;  //to represent entire excel workbook  
    static XSSFSheet sh; //to represent the particular sheet in the workbook

    //method to read string data
    public static String readStringData(int row, int col) throws IOException {
        f = new FileInputStream("C:\\Users\\hp\\git\\obsqura_sample\\SampleMavenProject\\src\\main\\resources\\NAME_AGE.xlsx"); //to open the excel file from this location
        w = new XSSFWorkbook(f);  //to load the file into memory using apache poi
        sh = w.getSheet("Sheet1"); //to select sheet1
        XSSFRow r = sh.getRow(row); //get the row based on the row number as in parameter
        XSSFCell c = r.getCell(col); //get the cell based on the column number  as in parameter
        return c.getStringCellValue();  //to get data as string or text format
    }

    //method to read integer data

    public static String readIntegerData(int row, int col) throws IOException {
        f = new FileInputStream("C:\\Users\\hp\\git\\obsqura_sample\\SampleMavenProject\\src\\main\\resources\\NAME_AGE.xlsx");
        w = new XSSFWorkbook(f);
        sh = w.getSheet("Sheet1");
        XSSFRow r = sh.getRow(row);
        XSSFCell c = r.getCell(col);
        int val = (int) c.getNumericCellValue(); //convert double to int using typecasting--this is to remove decimals
        return String.valueOf(val); //convert int to string using valueOf() method---for string representation-because return typei given as string

    }
}


