package com.tc25.date;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.tc25.bean.DVD;
import com.tc25.bean.User;

public class ListUser {
	ArrayList<User> arr1 = new ArrayList<>();
	ArrayList<DVD> arr2 = new ArrayList<>();
	User us1 = new User("","奥迪","123","",true);
	User us2 = new User("","大众","123","",true);
	User us3 = new User("","宝马","123","",true);
	User us4 = new User("","丰田","123","",true);
	User us5 = new User("","本田","123","",true);
	User us6 = new User("","三菱","123","",true);
	User us7 = new User("","日产","123","",true);
	User us8 = new User("","通用","123","",true);
	User us9 = new User("","铃木","123","",true);
	User us10 = new User("","雷诺","123","",true);
	User [] us = {us1,us2,us3,us4,us5,us6,us7,us8,us9,us10};
	DVD dvd1 = new DVD("中国",2017-11-21,null, 1,1);
	DVD dvd2 = new DVD("美国",2017-11-21,null, 1,1);
	DVD dvd3 = new DVD("法国",2017-11-21,null, 1,1);
	DVD dvd4 = new DVD("德国",2017-11-21,null, 1,1);
	DVD dvd5 = new DVD("英国",2017-11-21,null, 1,1);
	DVD dvd6 = new DVD("意大利",2017-11-21,null, 1,1);
	DVD dvd7 = new DVD("俄罗斯",2017-11-21,null, 1,1);
	DVD dvd8 = new DVD("韩国",2017-11-21,null, 1,1);
	DVD dvd9 = new DVD("日本",2017-11-21,null, 1,1);
	DVD dvd10 = new DVD("朝鲜",2017-11-21,null, 1,1);
	DVD [] dv = {dvd1,dvd2,dvd3,dvd4,dvd5,dvd6,dvd7,dvd8,dvd9,dvd10};
	public void addUser() {
		for (int i = 0; i < us.length; i++) {
			arr1.add(us[i]);
			arr1.get(i).setUserId(i+1);
			
			
			
		}
		
	}
	
	public void addDvd() {
		for (int i = 0; i < dv.length; i++) {
			arr2.add(dv[i]);
			arr2.get(i).setDvdID(i+1);
		}
	}
	
}
