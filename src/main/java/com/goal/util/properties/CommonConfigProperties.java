package com.goal.util.properties;

public class CommonConfigProperties extends GeneralProperties{
	/*首页滑动系列父id*/
	private static final String HOMEPAGE_SLIDER_SERIAL_ID="homepage.slider.serial.id";
	/*首页推荐系列id*/
	private static final String HOMEPAGE_RECOMMEND_SERIAL_ID="homepage.recommend.serial.id";
	
	private static CommonConfigProperties instance = new CommonConfigProperties();
	@Override
	protected String getPropertiesName() {
		return "commonConfigProperties";
	}
	
	public static String getHomepageSliderSerialId() {
		return instance.getString(HOMEPAGE_SLIDER_SERIAL_ID);
	}
	
	public static String getHomepageRecommendSerialId() {
		return instance.getString(HOMEPAGE_RECOMMEND_SERIAL_ID);
	}
	
	public static void main(String[] args) {
		System.out.println(CommonConfigProperties.getHomepageSliderSerialId());
		System.out.println(CommonConfigProperties.getHomepageRecommendSerialId());
	}
}
