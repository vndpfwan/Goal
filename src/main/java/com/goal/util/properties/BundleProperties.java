package com.goal.util.properties;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.goal.util.StringUtil;

/**
 * bundle properties
 * @author lizhiwei
 *
 */
public abstract class BundleProperties {
	private final Logger logger = LoggerFactory.getLogger(BundleProperties.class);
	
	private ResourceBundle rb;
	
	protected BundleProperties() {
		init();
	}
	
	/**
	 * 初始化方法
	 */
	protected final void init() {
		logger.info("init the properties for:"+getPropertiesName());
		setRb(findBundle(getPropertiesName()));
	}
	
	/**
	 * 通过properties name找到bundle
	 * @param proName
	 * @return
	 */
	protected final ResourceBundle findBundle(String proName) {
		try {
			return ResourceBundle.getBundle(getPropertiesName());
		}catch(MissingResourceException e) {
			logger.error("Bundle "+proName+".properties not found.");
			throw e;
		}
		
	}
	protected abstract String getPropertiesName();

	/**
	 * 通过key找到对应的value
	 * @param keyName
	 * @return
	 */
	protected final String getString(String keyName) {
		return StringUtil.trim(getRb().getString(keyName));
	}
	
	public ResourceBundle getRb() {
		return rb;
	}

	public void setRb(ResourceBundle rb) {
		this.rb = rb;
	}
	
}
