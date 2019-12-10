package day61_ExcelReadWrite;

public class TestExcelReadWrite {
	
	public static void main(String[] args) {
		String filePath = "C:\\Users\\nshal\\OneDrive\\Desktop\\TestData.xlsx"; //path of excel file
		String sheetname = "Sheet1"; //name of sheet
		ExcelReadWrite obj = new ExcelReadWrite(filePath, sheetname);
		String data1 = obj.readData(1, 0);
		System.out.println(data1);
		
		obj.writeData(1, 0, "Mehmet");
		String data2 = obj.readData(1, 0);
		System.out.println(data2);
		
		
	}

}
