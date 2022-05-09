package SeleniumTutorials;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {


		public static void main(String[] args) throws Exception {
			// we are checking file is present or not
			File f = new File("D:\\Sukanya_Automation\\TestData.xlsx");

			System.out.println(f.exists());
			// we are reading the file
			FileInputStream fis = new FileInputStream(f);
			// we have to load whole workbook or all sheets

			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			// if u want to focus on specific sheet.
			XSSFSheet sheet = workbook.getSheetAt(0);

			String data = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(data);

		}

	}
