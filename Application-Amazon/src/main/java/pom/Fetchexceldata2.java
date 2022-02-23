package pom;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchexceldata2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		String path = "C:\\Users\\DELL\\Desktop\\pawan.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet sh = WorkbookFactory.create(file).getSheet("pawan");
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("           ");
			
			for(int j=0; j<2; j++)
			{
				String value =sh.getRow(i).getCell(j).getStringCellValue();
				//System.out.print("    ");
				System.out.print(value);
				System.out.print("     ");
				
			}
			
			System.out.println("    ");
		}
		
	}

}
