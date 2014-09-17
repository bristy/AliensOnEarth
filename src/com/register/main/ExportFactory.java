package com.register.main;

import com.register.alien.exportformat.BaseExportFormat;
import com.register.alien.exportformat.PdfFormat;
import com.register.alien.exportformat.TextFormat;
import com.register.alien.model.AlienModel;

public class ExportFactory {
	// stop extension of this class
	private ExportFactory() {

	}

	public static BaseExportFormat getExportFormat(int type, AlienModel alien) {
		BaseExportFormat format = null;
		switch (type) {
		case CommonConstant.TEXT:
			format = new TextFormat(alien);
			break;
		case CommonConstant.PDF:
			format = new PdfFormat(alien);
			break;

		default:
			break;
		}
		return format;
	}
}
