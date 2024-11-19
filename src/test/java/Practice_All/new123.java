package Practice_All;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class new123 {
	
public static void main(String[] args) throws IOException {
		
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir") + "\\Excel\\Data.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1"); 
		
		int totalRows=sheet.getLastRowNum();
		System.out.println("Total rows " + totalRows);
		
		int cellCount=sheet.getRow(0).getLastCellNum();
		System.out.println("Total cells " +cellCount);
		
		for(int i=0;i<=totalRows;i++)
			
		{

         XSSFRow currentRow=sheet.getRow(i);
			for(int j=0;j<cellCount;j++)
			{
				XSSFCell currentCell=currentRow.getCell(j);
				
				System.out.print(currentCell+ "\t");
			}
			System.out.println();
		
		}
		workbook.close();
		fs.close();
	}
}


