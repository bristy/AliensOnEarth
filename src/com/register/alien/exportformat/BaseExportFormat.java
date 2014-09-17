package com.register.alien.exportformat;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.register.alien.model.AlienModel;
import com.register.main.CommonConstant;

/**
 * The Class BaseExportFormat. This class is extended all format classes
 */
public abstract class BaseExportFormat {
	protected AlienModel alien;
	protected PrintStream errStream;

	public BaseExportFormat(AlienModel alien) {
		super();
		this.alien = alien;
		try {
			errStream = new PrintStream(CommonConstant.LOG);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (null != errStream) {
				errStream.close();
			}
		}
	}

	/**
	 * This method will be implemented by all sub classes
	 */
	public abstract void export();
}
