package com.nt.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;


import com.nt.dto.StudentDTO;

public class StudentExcelView extends AbstractXlsView {

	@Override
	public void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<StudentDTO> listDTO=null;
		 Sheet sheet=null;
		 Row row=null;
		 int i=0;
		 int j=0;
		//get Model Attribute
		listDTO=(List<StudentDTO>) model.get("listDTO");
		//create Sheet
		sheet=workbook.createSheet("student Report");
		for(StudentDTO dto:listDTO){
			j=0;
			row=sheet.createRow(i);
			row.createCell(j).setCellValue(String.valueOf(dto.getSno()));
			row.createCell(j+1).setCellValue(dto.getSname());
			row.createCell(j+2).setCellValue(dto.getSadd());
			i++;
		}
	}

}
