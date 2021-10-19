package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	  public static Object[][] getData() throws IOException {
		  
		  File f=new File("C:\\Users\\Desigan D\\eclipse-workspace\\maven\\resources\\Book1.xlsx");
		  FileInputStream fs=new FileInputStream(f);
		  Workbook w= new XSSFWorkbook(fs);
		   Sheet s= w.getSheet("new");
		 Row r=  s.getRow(0);
		int rowcount= s.getPhysicalNumberOfRows();
		int cellcount= r.getPhysicalNumberOfCells();
		
		Object[][] obj= new Object[rowcount-1][cellcount];
		for (int i = 0; i < rowcount; i++) {
			Row row= s.getRow(i);
			for (int j = 0; j < cellcount; j++) {
				Cell cell =row.getCell(j);
				int type= cell.getCellType();
				String value=null;
				
				if (type==1) {
					value =cell.getStringCellValue();
					
				}
				else {
					if (DateUtil.isCellDateFormatted(cell)) {
						value=  new SimpleDateFormat("dd-mm-yyyy").format(cell.getDateCellValue());
						
					} 
					else {
						value=String.valueOf((long)cell.getNumericCellValue());
						
					}
					obj[i][j]=value;
				}
				
			}
		}
		return obj;
		  
		
	}
   
}
