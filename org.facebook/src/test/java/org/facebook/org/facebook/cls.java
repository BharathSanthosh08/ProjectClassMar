package org.facebook.org.facebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell; 
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class cls {
public static void main(String[] args) throws Exception {
	File s = new File("C:\\Users\\BHARATH V\\eclipse-workspace\\org.facebook\\target\\Book 2.xlsx.xlsx");

	FileOutputStream f1 = new FileOutputStream(s);
	HSSFWorkbook work = new HSSFWorkbook();
	HSSFSheet sheet =work.createSheet("Students");
	HSSFRow row = sheet.createRow(0);
	HSSFCell cell = row.createCell(0);
	
	
	cell.setCellValue("bharath");
	List<String> name = new ArrayList<>();
	name.add("subramani");
	name.add("sriram");
	name.add("kasthui");
	name.add("mukesh");
	name.add("madhan");
	 for(int i=0;i<name.size();i++) {
		 
		 HSSFRow row1 = sheet.createRow(i+1);
		 HSSFCell cell1 = row1.createCell(0);
		 cell1.setCellValue(name.get(i));
	 }
	
	 
	 
	work.write(s);
	work.close();
	
	
	


}
}
