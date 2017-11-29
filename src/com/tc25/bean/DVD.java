package com.tc25.bean;

import java.util.Date;
/**
 * 
 * @Title      : DVD.java
 * @Package    : com.tc25.bean
 * @Description: DVD类
 *
 * @author     Administrator
 * @date       2017年11月21日上午9:38:21
 * @version    1.0
 */
public class DVD implements Comparable<DVD> {
	private String dvdName;//DVD名称
	private int dvdID;//dvdid
	private Date dvdDate;//DVD入库时间
	private int dvdStatus;//DVD当前状态
	private int dvdLendCount;//DVD借出次数
	/**
	 * 
	 * <p>Title: 构造方法
	 * <p>Description: 无参构造
	 */
	public DVD()  {
		super();
	}
	/**
	 * 
	 * <p>Title: 构造方法
	 * <p>Description: 有参构造 
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
	 * 重写comparable方法
	 */
	@Override
	public int compareTo(DVD o) {
		// TODO Auto-generated method stub
		return this.getDvdLendCount()-o.getDvdLendCount();
	}
	
}
