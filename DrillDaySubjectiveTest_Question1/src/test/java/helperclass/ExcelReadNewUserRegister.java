package helperclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import action.ActionClass;
import pageobjectmodel.NewTourRegisterPage;

public class ExcelReadNewUserRegister extends NewTourRegisterPage {

 public void readExcel(WebDriver driver, String fileName, String sheetName, int rowNum) throws IOException {

  ActionClass action = new ActionClass(driver);
  DataFormatter formatter = new DataFormatter();
  // Create an object of File class to open xlsx file
  File file = new File(System.getProperty("user.dir") + "/src/test/resources/files/" + fileName);

  // Create an object of FileInputStream class to read excel file
  FileInputStream inputStream = new FileInputStream(file);

  Workbook workbookObj = new XSSFWorkbook(inputStream);

  // Read sheet inside the workbook by its name
  Sheet sheetObj = workbookObj.getSheet(sheetName);

  Row row = sheetObj.getRow(rowNum);

  // Create a loop to print cell values in a row
  for (int j = 0; j < row.getLastCellNum(); j++) {
   Cell cell = sheetObj.getRow(rowNum).getCell(j);
   String str = formatter.formatCellValue(cell);

   if (j == 0) {
    action.TextInput(firstName, str);
   }

   if (j == 1) {
    action.TextInput(lastName, str);
   }

   if (j == 2) {
    action.TextInput(phone, str);
   }

   if (j == 3) {
    action.TextInput(email, str);
   }
   if (j == 4) {
    action.TextInput(address, str);
   }
   if (j == 5) {
    action.TextInput(city, str);
   }
   if (j == 6) {
    action.TextInput(state, str);
   }
   if (j == 7) {
    action.TextInput(postalCode, str);
   }
   if (j == 8) {
    action.TextInput(userName, str);
   }
   if (j == 9) {
    action.TextInput(password, str);
   }
   if (j == 10) {
    action.TextInput(confirmPassword, str);
   }

  }

  workbookObj.close();

 }

}