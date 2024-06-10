package homi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xcelraw {
//reading the xlsx file
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\ELCOT\\eclipse-workspace\\test\\xcel\\homework.xlsx");
		FileInputStream s1=new FileInputStream(f1);
		XSSFWorkbook w=new XSSFWorkbook(s1);
		XSSFSheet sheet1=w.getSheet("sheet1");
		int rowsize=sheet1.getPhysicalNumberOfRows();
		//System.out.println(rowsize);
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
					System.out.println(c.getStringCellValue());
				}
				else if(type==0)
				{
					if(DateUtil.isCellDateFormatted(c))
					{
						Date d=c.getDateCellValue();
						SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
						String value=sd.format(d);
						System.out.println(value);
						
					}
					else
					{
						double x=c.getNumericCellValue();
						String value=String.valueOf(x);
						System.out.println(value);
					}
				}
				
	}

}
	}
}
