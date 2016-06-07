package com.bridge.session.bean;

import java.io.Serializable;

/** 
* @author 作者 ：Bridge
* @version 版本：1.0
* @createTime 创建时间：2016年6月3日 上午8:58:16
* @E-mail 邮箱：hu.wu@midea.com
* 类说明 
*/
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2534903297929731795L;
	
	private String name;
	
	private int age;
	
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
