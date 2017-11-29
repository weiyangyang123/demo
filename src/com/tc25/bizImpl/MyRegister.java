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
		System.out.println("�������û��ǳ�");
		String name = sc.next();
		int id = createId();
		//String account = createuserAccount();
		System.out.println("�������û�����");
		String pwd = sc.next();
		
		if(createuserAccount(pwd)) {
			System.out.println("����������벻���Ϲ��!!!");
		}
		User us = new User("",name,pwd, pwd, true);
		
		
	}
	/**
	 * 
	 * @Title: init 
	 * @Description: ��ʼ������.(�Զ���ķ���)
	 */
	public void initData() {
		ids = new ArrayList<>();
		accountList = new ArrayList<>();
		userList = new ArrayList<>();
	}
	/**
	 * 
	 * @Title: createId 
	 * @Description: �Զ�����ID�ķ��� 
	 * @param @return    �趨�ļ� 
	 * @return int    �������� 
	 * @return   �����û�ID��ֵ
	 */
	public int createId() {
		ids.add(ids.size()+1);
		return ids.size();
	}
	/**
	 * 
	 * @Title: createuserAccount 
	 * @Description: ����û��˺ŵķ��� 
	 * @param @return    �趨�ļ� 
	 * @return String    �����û����˺�
	 */
	public boolean createuserAccount(String pwd) {
		String account;
		Pattern p = Pattern.compile("^[A-Z]{1}[a-zA-Z0-9_.]{1,16}");
		Matcher m = p.matcher(pwd);
		
		//System.out.println(m.matches());
		return m.matches();
	}
	
}
