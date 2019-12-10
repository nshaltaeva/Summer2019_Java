package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
	
	public static void main(String[] args) throws Exception{
		String filePath = "C:\\Users\\nshal\\OneDrive\\Desktop\\TestData.xlsx"; //path of excel file
		String sheetname = "Sheet1"; //name of sheet
		
		FileInputStream file = new FileInputStream(filePath); //read a file
		
		Workbook excelFile = WorkbookFactory.create(file);// specially designed for Excel File 
	
		
		Sheet sheet = excelFile.getSheet(sheetname);//gets the specific spreadsheet from Excel File
			
		Cell cell = sheet.getRow(1).getCell(2);//retrieves specific cell from spreadsheet
		cell.setCellValue("Marufjon");//it reads that cell value as "Marufjon", BUT it does not change original value
		
		
		String cellData = cell.toString();
		System.out.println(cellData);
		
		
		
	}

}
