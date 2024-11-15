package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getdatafromexcel(String SheetName, int RowIndex, int ColumnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream Efis = new FileInputStream("./ExcelFile./DemoWebShopRegister.xlsx");
		Workbook Workbook = WorkbookFactory.create(Efis);
		return Workbook.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	}

}
