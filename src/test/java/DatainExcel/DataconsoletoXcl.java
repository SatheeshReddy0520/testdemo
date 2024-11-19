package DatainExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataconsoletoXcl {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Excel\\myfile1.xlsx"); 

		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Days");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Total no of rows");
		int noOfRows=sc.nextInt(); 
		
		System.out.println("Enter no of cells");
		int noOfCells=sc.nextInt();
		
		for(int i=0;i<=noOfRows;i++)
		{
			XSSFRow row=sheet.createRow(i);
		
		for (int j=0;j<noOfCells;j++)
		{
			XSSFCell cell=row.createCell(j);
			
			System.out.println("Add the Data");
			cell.setCellValue(sc.next());
		}
		
	workbook.write(file);
	workbook.close();
	file.close();
		
		
		}

	}

}