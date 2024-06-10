package homi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class first {
//create and write new excel
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\ELCOT\\eclipse-workspace\\homi\\xcel\\write.xlsx");
		Workbook book=new XSSFWorkbook();
		Sheet s=book.createSheet("Karti");
		Row r0=s.createRow(0);
		for(int i=0;i<10;i++)
		{
			Cell c=r0.createCell(i);
			c.setCellValue("go");
		}
		FileOutputStream f2=new FileOutputStream(f1);
		//System.out.println("done");
		book.write(f2);
		f2.close();
		
		

	}

}
