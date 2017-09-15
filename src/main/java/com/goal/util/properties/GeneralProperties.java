package com.goal.util.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class GeneralProperties {

	private final Logger LOG = LoggerFactory.getLogger(GeneralProperties.class);
	
	private final String PROP_FILE_EXT=".properties";
	
	private Properties properties = new Properties();
	
	protected abstract String getPropertiesName();
	
	protected GeneralProperties() {
		initialize();
	}
	/**
	 * Loads properties from file.
	 */
	private final void initialize() {
		FileInputStream is = null;
		StringBuffer pathName = new StringBuffer(ProjectProperties.getRootPath());
		pathName.append(ProjectProperties.getPropertiesPath());
		pathName.append("/");
		pathName.append(getPropertiesName());
		pathName.append(PROP_FILE_EXT);
		File file = new File(pathName.toString());
		
		try {
			is = new FileInputStream(file);
			properties.load(is);
		} catch (FileNotFoundException e) {
			LOG.error("Properties file " + getPropertiesName() + " not found.");	//$NON-NLS-1$
		} catch (IOException e) {
			LOG.error("Error reading properties file " + getPropertiesName() + " .");	//$NON-NLS-1$
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException io) {
				//ignore the excep
			}
		}
	}
	
	protected final String getString(String name) {
		return (String) properties.get(name);
	}
}
