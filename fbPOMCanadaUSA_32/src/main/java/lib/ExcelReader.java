package lib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	Sheet sheet;
	
	public ExcelReader(String fileLocation, String sheetName) throws IOException {		// file location & sheet name can be imported from anywhere
		FileInputStream fs = new FileInputStream(fileLocation);
		Workbook wb = new XSSFWorkbook(fs);
		sheet=wb.getSheet(sheetName);
	}
	
	public Object [][] excelToArray(){
		
		Object [][] t;												// Declare array
		
		// Initialize  the array: [row][column] 
		int totalRow = sheet.getPhysicalNumberOfRows();
		int totalCell= sheet.getRow(0).getPhysicalNumberOfCells();
		
		t=new Object [totalRow-1][totalCell];						// totalRow-1 of Array, to exclude the row title; total column is same
		
		for (int row=1; row<totalRow; row++) {						// row=1; since excel row starts from 1
			
			for(int cell=0; cell<totalCell; cell++) {				// column
				
				t [row-1][cell]=getCellData(row, cell);
			}
		}
		return t;
	}
	
	public String getCellData(int row, int cell){					// will return each cell value
		
		String result = "";
		Cell cellValue=sheet.getRow(row).getCell(cell)	;			// get cell value
		
		if (cellValue.getCellType()==Cell.CELL_TYPE_STRING) {
			String value=cellValue.getStringCellValue();
			result=value;
		}
		else {
			if (cellValue.getNumericCellValue()%1==0) {
				int value=(int)cellValue.getNumericCellValue();		//suppose we want int value// getNumericCellValue() returns double value
				result=""+value;									// convert int to String
			}
			else {
				double value=cellValue.getNumericCellValue();	
				result=""+value;
			}
		}
		return result;
		
	}
}




