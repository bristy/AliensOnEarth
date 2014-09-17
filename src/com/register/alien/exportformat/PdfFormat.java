package com.register.alien.exportformat;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.register.alien.model.AlienModel;
import com.register.main.CommonConstant;

public class PdfFormat extends BaseExportFormat {

	public PdfFormat(AlienModel alien) {
		super(alien);
	}

	@Override
	public void export() {
		if (null != alien) {
			String fileName = alien.getCodeName()
					+ CommonConstant.PDF_FORMAT_EXTENTION;
			System.out.println("Exporting " + fileName);
			Document document = null;
			try {
				document = new Document();
				PdfWriter.getInstance(document, new FileOutputStream(fileName));
				document.open();
				Paragraph preface = new Paragraph();
				List<String> data = alien.getDataInListFormat();
				for (String singleData : data) {
					preface.add(singleData + CommonConstant.NEW_LINE);
				}
				document.add(preface);
				System.out.println("Export Completed.");
			} catch (FileNotFoundException | DocumentException e) {
				e.printStackTrace(errStream);
			} finally {
				if (null != document) {
					document.close();
				}
			}
		}

	}

}
