package com.tc25.view;

import java.util.Scanner;

public class View {
	Scanner sc = new Scanner(System.in);
	public void myview() {
		for (int i = 0; i < 20; i++) {
			System.out.print("***");
			if (i == 9) {
				System.out.println("");
				System.out.println("\n\t" +  "欢迎进入DVD系统");
			}
		}
		System.out.println("\n\t" + " <按1.登录界面>");
		System.out.println("\n\t" + " <按2.注册界面>");
		System.out.println("\n\t" + " <按3.系统退出>");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			mylogn();
			
			break;
		case 2:
			
			myregister();
			break;
		case 3:
			
			break;

		default:
			break;
		}
	}
	public void myregister() {
		for (int i = 0; i < 25; i++) {
			System.out.print("*");
				System.out.print("");
		}
				System.out.println("\n\t" +  "欢迎进入注册页面");
		
		System.out.println("按1.请填写账号");
		System.out.println("按2.请填写昵称");
		System.out.println("按3.请填写昵称");
		System.out.println("按4.请确认密码");
		System.out.println("按5.返回上一级");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			myview();
			break;
		default:
			break;
			
		}
	}
	public void mylogn() {
		for (int i = 0; i < 25; i++) {
			System.out.print("*");
		}
				System.out.println("\n\t" +  "欢迎进入登录页面");
		
		System.out.println("按1.请输入账号");
		System.out.println("按2.请输入密码");
		System.out.println("按3.返回上一级");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			
			break;
		case 2:
			break;
		case 3:
			myview();
			break;
		default:
			break;
			
		}
	}
}
