package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook ;
	static XSSFSheet sheet ;

	
	public ExcelUtils(String excelPath,String sheetName) {
		// TODO Auto-generated constructor stub
		
		 try {
			workbook = new XSSFWorkbook(excelPath);
			 sheet = workbook.getSheet(sheetName); 
			 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("\n Exception Execl constructor \n Error :"+e.getMessage()+"\nCaused by :"+e.getCause()+"\n\n");
			e.printStackTrace();
		}

		
	}
	
	public static void main(String[] args) {
		//getRowCount();
		getCellDateString(0,0);
		getCellDateNumber(1,1);
	}
	
	
	public static int getRowCount() {
	
		int rowCount=0;
		
		try {
			
			//create reference for worksheet
			

			rowCount=sheet.getPhysicalNumberOfRows();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("\n Exception ExcelGetRowCount \n Error :"+e.getMessage()+"\nCaused by :"+e.getCause()+"\n\n");
			e.printStackTrace();
		}
			
		return rowCount;
		
	}
	
	public static int getColCount() {
		
		int cloCount=0;
		
		try {
			
			//create reference for worksheet

			cloCount=sheet.getRow(0).getPhysicalNumberOfCells();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("\n Exception ExcelGetRowCount \n Error :"+e.getMessage()+"\nCaused by :"+e.getCause()+"\n\n");
			e.printStackTrace();
		}
		
		return cloCount;

		
	}
	
	public static String getCellDateString(int rown,int coln) {
		
		String data="";
		
		try {
			

			 data=sheet.getRow(rown).getCell(coln).getStringCellValue();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("\n Exception ExcelGetCellData \n Error :"+e.getMessage()+"\nCaused by :"+e.getCause()+"\n\n");
			e.printStackTrace();
		}
		
		return data;
		
	}
	
public static double  getCellDateNumber(int rown,int coln) {
		
	
	double data=0;
		try {

			data=sheet.getRow(rown).getCell(coln).getNumericCellValue();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("\n Exception ExcelGetCellData \n Error :"+e.getMessage()+"\nCaused by :"+e.getCause()+"\n\n");
			e.printStackTrace();
		}
		
		return data;
		
	}


}
