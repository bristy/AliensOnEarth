package com.register.main;

import com.register.alien.exportformat.BaseExportFormat;
import com.register.alien.exportformat.PdfFormat;
import com.register.alien.exportformat.TextFormat;
import com.register.alien.model.AlienModel;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Export objects. If we want to add new export feature
 * we have to register that here
 */
public class ExportFactory {
	// stop extension of this class
	/**
	 * Instantiates a new export factory.
	 */
	private ExportFactory() {

	}

	/**
	 * Gets the export format.
	 * 
	 * @param type
	 *            the type
	 * @param alien
	 *            the alien
	 * @return the export format
	 */
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
