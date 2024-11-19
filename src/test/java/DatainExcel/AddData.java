package DatainExcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddData {

	public static void main(String[] args) throws IOException {
		
FileOutputStream fis = new FileOutputStream(System.getProperty("user.dir") + "\\Excel\\AddData.xlsx");
		
		XSSFWorkbook fs = new XSSFWorkbook();
		
		XSSFSheet st = fs.createSheet("Seasons");
		XSSFRow row1 = st.createRow(0);
		row1.createCell(0).setCellValue("Rainy Season");
		row1.createCell(1).setCellValue("sep");
		row1.createCell(2).setCellValue("oct");
		row1.createCell(3).setCellValue("nov");
		
		XSSFRow row2 = st.createRow(1);
		row2.createCell(0).setCellValue("Summer Season");
		row2.createCell(1).setCellValue("april");
		row2.createCell(2).setCellValue("may");
		row2.createCell(3).setCellValue("june");
		
		XSSFRow row3 = st.createRow(2);
		row3.createCell(0).setCellValue("Winter Season");
		row3.createCell(1).setCellValue("Dec");
		row3.createCell(2).setCellValue("jan");
		row3.createCell(3).setCellValue("feb");
		
	
		
	fs.write(fis);
	fs.close();
	fis.close();
	
	System.out.println("Data Added Sucessfully");
	
	}

}
