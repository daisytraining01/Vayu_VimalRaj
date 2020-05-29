package com.wordpress;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static int i;

	public void writeFile(List<String> list) throws IOException {
		
		try {
			File file = new File(System.getProperty("user.dir") + "/Master Excel.xlsx");
			FileOutputStream out = new FileOutputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("TextLink");

			int cellnum = 0;
			int rownum = 0;

			Iterator<String> tempIterator = list.iterator();
			Row row = sheet.createRow(rownum);
			cellnum = 0;
			while (tempIterator.hasNext()) {
				String temp = (String) tempIterator.next();
				Cell cell = row.createCell(cellnum++);
				cell.setCellValue(temp);

			}
			workbook.write(out);
			out.close();
			workbook.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
