package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws Exception{
		String filePath = "C:\\Users\\nshal\\OneDrive\\Desktop\\TestData.xlsx"; //path of excel file
		String sheetname = "Sheet1"; //name of sheet
		
		FileInputStream file = new FileInputStream(filePath); //read a file
		
		Workbook excelFile = WorkbookFactory.create(file);// specially designed for Excel File 
	//	XSSFWorkbook excelFile2 = new XSSFWorkbook(file);//same 
		
		Sheet sheet = excelFile.getSheet(sheetname);//gets the specific spreadsheet from Excel File
	//	XSSFSheet sheet2 = excelFile2.getSheet(sheetname);//same 
		
		
		Cell cell = sheet.getRow(1).getCell(2);//retrieves specific cell from spreadsheet
		
	//	String cellData = cell.getStringCellValue();//converts the cell' value to String data
		String cellData = cell.toString();//converts the cell' value to String data
		System.out.println(cellData);
		
		
	}
	}
	
	
