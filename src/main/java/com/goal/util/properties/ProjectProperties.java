package com.goal.util.properties;

/**
 * project properties
 * @author lizhiwei
 *
 */
public class ProjectProperties extends BundleProperties{
	private static final String PROJECT_ROOT_PATH="project.root.path";
	
	private static final String PROPERTIES_PATH = "properties.path";
	
	private static final ProjectProperties instance = new ProjectProperties();
	
	private ProjectProperties() {
		
	}
	/**
	 * 获得根目录路径
	 * @return
	 */
	public static String getRootPath() {
		return instance.getString(PROJECT_ROOT_PATH);
	}
	
	/**
	 * 
	 * @return
	 */
	public static String getPropertiesPath() {
		return instance.getString(PROPERTIES_PATH);
	}
	@Override
	protected String getPropertiesName() {
		return "project";
	}
	
	public static void main(String[] args) {
		System.out.println(ProjectProperties.getRootPath()+ProjectProperties.getPropertiesPath());
	}
}
