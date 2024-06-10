package homi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class modifyexcel {
//modifying the existing xlsx file
	public static void main(String[] args) throws IOException  {
		File f1=new File("C:\\Users\\ELCOT\\eclipse-workspace\\homi\\xcel\\write.xlsx");
		FileInputStream f2=new FileInputStream(f1);
		XSSFWorkbook book=new XSSFWorkbook(f2);
	//	int act=book.getActiveSheetIndex();
		//System.out.println(act);
		XSSFSheet sheet1=book.getSheet("Sheet1");
		int rowsize=sheet1.getPhysicalNumberOfRows();
		System.out.println(rowsize);
		for(int i=0;i<rowsize;i++)
		{
			XSSFRow r=sheet1.getRow(i);
			int colsize=r.getPhysicalNumberOfCells();
			//System.out.println(colsize);
			for(int j=0;j<colsize;j++)
			{
				XSSFCell c=r.getCell(j);
				int type=c.getCellType();
				//System.out.println(type);
				if(type==1)
				{
					String value=c.getStringCellValue();
					if(value.equals("go"))
					{
						c.setCellValue("went");
					}
				}
			}
		}
FileOutputStream f3=new FileOutputStream(f1);
book.write(f3);
f3.close();
	}

}
