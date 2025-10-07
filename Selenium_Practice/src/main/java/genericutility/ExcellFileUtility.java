package genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellFileUtility 
{
	  public String getDataFromExcel(String sheetName,int rownum,int celnum) throws EncryptedDocumentException, IOException
	  {
		  FileInputStream fis=new FileInputStream("./testdata/commondata2.properties");
		  Workbook wb=WorkbookFactory.create(fis);
		  String data= wb.getSheet(sheetName).getRow(rownum).getCell(celnum).getStringCellValue();
		  
		  return data;
	  }
	
	
}
