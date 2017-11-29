package com.tc25.bizImpl;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.tc25.bean.User;
import com.tc25.biz.Register;

public class MyRegister implements Register {
	private ArrayList<Integer> ids ;
	private ArrayList<Integer> accountList;
	private ArrayList<User> userList;
	Scanner sc = new Scanner(System.in);
	@Override
	public void register() {
		System.out.println("请输入用户昵称");
		String name = sc.next();
		int id = createId();
		//String account = createuserAccount();
		System.out.println("请输入用户密码");
		String pwd = sc.next();
		
		if(createuserAccount(pwd)) {
			System.out.println("你输入的密码不符合规格!!!");
		}
		User us = new User("",name,pwd, pwd, true);
		
		
	}
	/**
	 * 
	 * @Title: init 
	 * @Description: 初始化数据.(自定义的方法)
	 */
	public void initData() {
		ids = new ArrayList<>();
		accountList = new ArrayList<>();
		userList = new ArrayList<>();
	}
	/**
	 * 
	 * @Title: createId 
	 * @Description: 自动生成ID的方法 
	 * @param @return    设定文件 
	 * @return int    返回类型 
	 * @return   返回用户ID的值
	 */
	public int createId() {
		ids.add(ids.size()+1);
		return ids.size();
	}
	/**
	 * 
	 * @Title: createuserAccount 
	 * @Description: 获得用户账号的方法 
	 * @param @return    设定文件 
	 * @return String    返回用户的账号
	 */
	public boolean createuserAccount(String pwd) {
		String account;
		Pattern p = Pattern.compile("^[A-Z]{1}[a-zA-Z0-9_.]{1,16}");
		Matcher m = p.matcher(pwd);
		
		//System.out.println(m.matches());
		return m.matches();
	}
	
}
