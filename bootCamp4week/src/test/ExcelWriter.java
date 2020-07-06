package test;
/* 참고 블로그
 * https://javaslave.tistory.com/79
 * */
import java.io.*;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
	public void excel_writer(List<DTO> dto, String stat_type) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet();
		
		XSSFRow row = sheet.createRow(0);
		
		XSSFCell cell;
		
		cell = row.createCell(1);
		cell.setCellValue("FA_ID");
		
		cell = row.createCell(2);
		cell.setCellValue("LT_ID");
		
		cell = row.createCell(3);
		cell.setCellValue("PROD_ID");
		
		cell = row.createCell(4);
		cell.setCellValue("TIMEKEY");
		
		cell = row.createCell(5);
		cell.setCellValue("FL_ID");
		
		cell = row.createCell(6);
		cell.setCellValue("OP_ID");
		
		cell = row.createCell(7);
		cell.setCellValue("STAT_CD");
		
		cell = row.createCell(8);
		cell.setCellValue("STAT_TYP");
		
		DTO data;
		for(int rowIdx = 0; rowIdx < dto.size(); rowIdx++) {
			data = dto.get(rowIdx);
			
			row = sheet.createRow(rowIdx+1);
			
			cell = row.createCell(1);
			cell.setCellValue(data.getFA_ID());
			
			cell = row.createCell(2);
			cell.setCellValue(data.getLT_ID());
			
			cell = row.createCell(3);
			cell.setCellValue(data.getPROD_ID());
			
			cell = row.createCell(4);
			cell.setCellValue(data.getTIMEKEY());
			
			cell = row.createCell(5);
			cell.setCellValue(data.getFL_ID());
			
			cell = row.createCell(6);
			cell.setCellValue(data.getOP_ID());
			
			cell = row.createCell(7);
			cell.setCellValue(data.getSTAT_CD());
			
			cell = row.createCell(8);
			cell.setCellValue(data.getSTAT_TYP());
		}
		
		File file = new File("C:\\Users\\geni\\Desktop\\"+stat_type+".xlsx");
		FileOutputStream fos = null; 
		try {
			fos = new FileOutputStream(file);
			workbook.write(fos);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(workbook != null) workbook.close();
				if(fos != null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
