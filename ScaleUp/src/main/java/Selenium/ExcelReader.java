package Selenium;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) {
        String filePath = "path_to_your_excel_file.xlsx";
        String sheetName = "Sheet1";

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet != null) {
                int rowCount = sheet.getLastRowNum();
                for (int i = 0; i <= rowCount; i++) {
                    Row row = sheet.getRow(i);
                    if (row != null) {
                        int columnCount = row.getLastCellNum();
                        for (int j = 0; j < columnCount; j++) {
                            Cell cell = row.getCell(j);
                            if (cell != null) {
                                String cellValue = getCellValueAsString(cell);
                                System.out.println(cellValue);
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getCellValueAsString(Cell cell) {
        if (cell.getCellType() == CellType.STRING) {
            return cell.getStringCellValue();
        } else if (cell.getCellType() == CellType.NUMERIC) {
            return String.valueOf(cell.getNumericCellValue());
        } else if (cell.getCellType() == CellType.BOOLEAN) {
            return String.valueOf(cell.getBooleanCellValue());
        } else {
            return "";
        }
    }
}