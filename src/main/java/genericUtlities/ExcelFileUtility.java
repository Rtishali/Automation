package genericUtlities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
public String readDatafromExcl(String Sheetname,int rownum,int cellnum) throws Throwable {
	FileInputStream fise=new FileInputStream(IconstantUtility.excelPath);
	Workbook wb = WorkbookFactory.create(fise);
	String value = wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	return value;
}
}
