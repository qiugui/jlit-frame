package com.jlit.core.dao.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


/** 
 * @ClassName User 
 * @Description please write your description
 * @author Gui 
 * @date 2016年7月10日 下午11:15:07 
 *
 */
	
public class User {



	/** 
	 * @Fields id please write this field's function
	 *
	 */
	private int id;
	/** 
	 * @Fields username 用户名
	 *
	 */
	private String username; 
	/** 
	 * @Fields password please write this field's function
	 *
	 */
	private String password;
	

	/**   
	 * @Title ss   
	 * @Description 用来标识用户属性的
	 * @param name 用户名
	 * @param id 用户的id
	 * @return 用户的标识
	 *
	 */
	public String ss(String name, int id){
		String tempString = "";
		try {
			InputStream is = new FileInputStream(new File(""));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return tempString;
		
	}


	/**  
	 * @Title getId 
	 * @Description please write your description
	 * @return the id
	 *
	 */
	public int getId() {
		return id;
	}


	/**  
	 * @Title setId
	 * @Description please write your description
	 * @param id the id to set
	 *
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**  
	 * @Title getUsername 
	 * @Description please write your description
	 * @return the username
	 *
	 */
	public String getUsername() {
		return username;
	}


	/**  
	 * @Title setUsername
	 * @Description please write your description
	 * @param username the username to set
	 *
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**  
	 * @Title getPassword 
	 * @Description please write your description
	 * @return the password
	 *
	 */
	public String getPassword() {
		return password;
	}


	/**  
	 * @Title setPassword
	 * @Description please write your description
	 * @param password the password to set
	 *
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
