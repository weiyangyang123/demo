package com.tc25.bean;

import java.util.Date;
/**
 * 
 * @Title      : DVD.java
 * @Package    : com.tc25.bean
 * @Description: DVD��
 *
 * @author     Administrator
 * @date       2017��11��21������9:38:21
 * @version    1.0
 */
public class DVD implements Comparable<DVD> {
	private String dvdName;//DVD����
	private int dvdID;//dvdid
	private Date dvdDate;//DVD���ʱ��
	private int dvdStatus;//DVD��ǰ״̬
	private int dvdLendCount;//DVD�������
	/**
	 * 
	 * <p>Title: ���췽��
	 * <p>Description: �޲ι���
	 */
	public DVD()  {
		super();
	}
	/**
	 * 
	 * <p>Title: ���췽��
	 * <p>Description: �вι��� 
	 * @param dvdName
	 * @param dvdID
	 * @param dvdDate
	 * @param dvdStatus
	 * @param dvdLendCount
	 */
	public DVD(String dvdName, int dvdID, Date dvdDate, int dvdStatus, int dvdLendCount) {
		super();
		this.dvdName = dvdName;
		this.dvdID = dvdID;
		this.dvdDate = dvdDate;
		this.dvdStatus = dvdStatus;
		this.dvdLendCount = dvdLendCount;
	}
	public DVD(String dvdName, Date dvdDate, int dvdStatus, int dvdLendCount) {
		super();
		this.dvdName = dvdName;
		this.dvdDate = dvdDate;
		this.dvdStatus = dvdStatus;
		this.dvdLendCount = dvdLendCount;
	}
	public String getDvdName() {
		return dvdName;
	}
	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}
	public int getDvdID() {
		return dvdID;
	}
	public void setDvdID(int dvdID) {
		this.dvdID = dvdID;
	}
	public Date getDvdDate() {
		return dvdDate;
	}
	public void setDvdDate(Date dvdDate) {
		this.dvdDate = dvdDate;
	}
	public int getDvdStatus() {
		return dvdStatus;
	}
	public void setDvdStatus(int dvdStatus) {
		this.dvdStatus = dvdStatus;
	}
	public int getDvdLendCount() {
		return dvdLendCount;
	}
	public void setDvdLendCount(int dvdLendCount) {
		this.dvdLendCount = dvdLendCount;
	}
	@Override
	public String toString() {
		return "DVD [dvdName=" + dvdName + ", dvdID=" + dvdID + ", dvdDate=" + dvdDate + ", "
				+ "dvdStatus=" + dvdStatus
				+ ", dvdLendCount=" + dvdLendCount + "]";
	}
	/**
	 * ��дcomparable����
	 */
	@Override
	public int compareTo(DVD o) {
		// TODO Auto-generated method stub
		return this.getDvdLendCount()-o.getDvdLendCount();
	}
	
}
