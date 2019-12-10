package day61_ExcelReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadWrite {
	
	/*
	 * create custom class 
	 */

	String filePath;
	String SheetName;
	
	FileInputStream file;
	Workbook excelfile;
	Sheet sheet;
	
	Cell cell;
	
	public ExcelReadWrite(String filePath, String SheetName) {
		this.filePath = filePath;
		this.SheetName = SheetName;
		
		try {
			file = new FileInputStream(filePath);
			excelfile = WorkbookFactory.create(file);
			sheet = excelfile.getSheet(SheetName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String readData(int rowNum, int cellNum) {

		String data = ""; //store the cell data
		
		cell = sheet.getRow(rowNum).getCell(cellNum);
		data = cell.toString();
		
		return data;
	}
	
	public void writeData(int rowNum, int cellNum, String setValue) {
		cell = sheet.getRow(rowNum).getCell(cellNum);
		cell.setCellValue(setValue);
		}
	
	
	
	
	
	
	
	
	
	
	
	
}
