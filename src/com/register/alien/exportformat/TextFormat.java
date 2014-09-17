package com.register.alien.exportformat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.register.alien.model.AlienModel;
import com.register.main.CommonConstant;

// TODO: Auto-generated Javadoc
/**
 * The Class TextFormat.
 */
public class TextFormat extends BaseExportFormat {

	/**
	 * Instantiates a new text format.
	 *
	 * @param alien the alien
	 */
	public TextFormat(AlienModel alien) {
		super(alien);
	}

	/* (non-Javadoc)
	 * @see com.register.alien.exportformat.BaseExportFormat#export()
	 */
	@Override
	public void export() {
		if (null != alien) {
			BufferedWriter out = null;
			try {
				String fileName = alien.getCodeName()
						+ CommonConstant.TEXT_FORMAT_EXTENTION;
				System.out.println("Exporting " + fileName);
				FileWriter saveFile = new FileWriter(fileName);
				out = new BufferedWriter(saveFile);
				List<String> data = alien.getDataInListFormat();
				for (String singleData : data) {
					out.write(singleData + CommonConstant.NEW_LINE);
				}

				System.out.println("Export Completed.");
			} catch (IOException e) {
				e.printStackTrace(errStream);
			} finally {
				if (null != errStream) {
					errStream.close();
				}
				if (null != out) {
					try {
						out.close();
					} catch (IOException e) {
						// left intentionally
					}
				}
			}
		}
	}
}
