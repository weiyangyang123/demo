package com.tc25.view;

import java.util.Scanner;

public class View {
	Scanner sc = new Scanner(System.in);
	public void myview() {
		for (int i = 0; i < 20; i++) {
			System.out.print("***");
			if (i == 9) {
				System.out.println("");
				System.out.println("\n\t" +  "��ӭ����DVDϵͳ");
			}
		}
		System.out.println("\n\t" + " <��1.��¼����>");
		System.out.println("\n\t" + " <��2.ע�����>");
		System.out.println("\n\t" + " <��3.ϵͳ�˳�>");
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
				System.out.println("\n\t" +  "��ӭ����ע��ҳ��");
		
		System.out.println("��1.����д�˺�");
		System.out.println("��2.����д�ǳ�");
		System.out.println("��3.����д�ǳ�");
		System.out.println("��4.��ȷ������");
		System.out.println("��5.������һ��");
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
				System.out.println("\n\t" +  "��ӭ�����¼ҳ��");
		
		System.out.println("��1.�������˺�");
		System.out.println("��2.����������");
		System.out.println("��3.������һ��");
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
