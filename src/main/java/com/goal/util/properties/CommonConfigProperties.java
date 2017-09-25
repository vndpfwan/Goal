package com.goal.util.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 此类用于项目一般属性的配置读取
 * @author lizhiwei
 *
 */
public class CommonConfigProperties extends GeneralProperties{
	private static final Logger LOG = LoggerFactory.getLogger(CommonConfigProperties.class);
	/*首页滑动系列父id*/
	private static final String HOMEPAGE_SLIDER_SERIAL_ID="homepage.slider.serial.id";
	
	/*首页推荐系列id*/
	private static final String HOMEPAGE_RECOMMEND_SERIAL_ID="homepage.recommend.serial.id";
	
	/*图片文件URL前缀*/
	private static final String FILE_PICTURE_PRE_URL = "file.pic.preUrl";
	
	private static final CommonConfigProperties instance = new CommonConfigProperties();
	
	private CommonConfigProperties() {
		
	}
	@Override
	protected String getPropertiesName() {
		return "commonConfigProperties";
	}

	/**
	 * 取得首页滑动系列父id
	 * @return
	 */
	public static String getHomepageSliderSerialId() {
		LOG.info("calling getHomepageSliderSerialId()");
		return instance.getString(HOMEPAGE_SLIDER_SERIAL_ID);
	}
	
	/**
	 * 取得首页推荐系列id
	 * @return
	 */
	public static String getHomepageRecommendSerialId() {
		return instance.getString(HOMEPAGE_RECOMMEND_SERIAL_ID);
	}
	
	/**
	 * 取得图片文件URL前缀
	 * @return
	 */
	public static String getPicturePreUrl() {
		return instance.getString(FILE_PICTURE_PRE_URL);
	}
	public static void main(String[] args) {
		System.out.println(CommonConfigProperties.getHomepageSliderSerialId());
		System.out.println(CommonConfigProperties.getHomepageRecommendSerialId());
		System.out.println(CommonConfigProperties.getPicturePreUrl());
	}
}
