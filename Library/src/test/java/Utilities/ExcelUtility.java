package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtility {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	private static int cel;
	
	public static void setExcelFile(String Path, String SheetName)
			throws Exception {
		try {
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the excel data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e) {
			throw (e);
		}
	}
	
	 
	
	
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			String CellData = "";
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			if (Cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
			{
				//System.out.print(Cell.getStringCellValue()+" ");
				CellData = Cell.getStringCellValue();
				 
				 
			}
			else if(Cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
			{
				System.out.print(Cell.getNumericCellValue()+" ");
				 double CellDat = Cell.getNumericCellValue();
				// System.out.println(CellDat);
				cel = (int) (CellDat);
				 CellData = String.valueOf(cel);
				  
			}
			
			else if(Cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN)
			{
				//System.out.print(Cell.getBooleanCellValue()+" ");
				 boolean CellDat = Cell.getBooleanCellValue(); 
				 //System.out.println(CellDat); 
				 CellData = String.valueOf(CellDat);
				  
			}
			
			else if(Cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)
			{
				
				 
			}
			 
					
			return CellData;
		}
			catch (Exception e) {
				return "";
			}
	}
	
	
	
	
	/*
	 * Write in the Excel cell
	 * @params - Row num and Col num
	 */
	
	public static void setCellData(String Result, int RowNum, int ColNum)
			throws Exception {
		try {
			Row = ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
			if (Cell == null) {
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(Result);
			} else {
				 
				Cell.setCellValue(Result);
			}

			// Open the file to write the results
			FileOutputStream fileOut = new FileOutputStream(Constants.File_Path + Constants.File_Name);
			
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}
}
