package JavaActivity4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Activity4_3 {

private static String excelfile = "C://DINESH US BACK UP/DINESH_Document/Dineshauto.xlsx";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data types in java");
		
		Object [][] datatypes = {
				{"Datatype", "Type", "Size in (bytes)"},
				{"int", "Primitive", 2},
				{"float", "Primitive", 4},
				{"Char", "Primitive", 1},
				{"double", "Primitive", 8},
				{"String", "Non-Primitive", "No fixed size"}};
		
		int rowNum = 0;
		for (Object[] datatype : datatypes) {
			Row row = sheet.createRow(rowNum++);
			int colNum = 0;
			for (Object field : datatype) {
				Cell cell = row.createCell(colNum++);
				if (field instanceof String) {
					cell.setCellValue((String) field);
					}else if (field instanceof Integer) {
						cell.setCellValue((Integer) field);
					}
			}
		}
		 try {
	            FileOutputStream outputStream = new FileOutputStream(excelfile);
	            workbook.write(outputStream);
	            workbook.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Done");
		
	}
}
