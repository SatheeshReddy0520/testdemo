package Practice_All;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPappulu {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fis=new FileOutputStream(System.getProperty("user.dir")+"\\Excel\\AddData2.xlsx");

		XSSFWorkbook fs=new XSSFWorkbook();
		
		XSSFSheet st=fs.createSheet("Bugs");
		
		XSSFRow row=st.createRow(0);
		row.createCell(0).setCellValue("Test ID");
		row.createCell(1).setCellValue("Description");
		row.createCell(2).setCellValue("Expected Result");
		row.createCell(3).setCellValue("Actual Result");
		row.createCell(4).setCellValue("Status");
		row.createCell(5).setCellValue("Seveority");
		row.createCell(6).setCellValue("Priority");
		row.createCell(7).setCellValue("Attachments");
		
		
	fs.write(fis);
		fs.close();
		fis.close();
		
		
		
		
		
		
		
	}

}
