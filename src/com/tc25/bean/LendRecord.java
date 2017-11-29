package com.tc25.bean;

import java.util.Date;
/**
 * 
 * @Title      : LendRecord.java
 * @Package    : com.tc25.bean
 * @Description: 借出记录类
 *
 * @author     Administrator
 * @date       2017年11月21日上午9:41:12
 * @version    1.0
 */
public class LendRecord implements Comparable<LendRecord>{
	private String lendRecord;//借出记录
	private int lrId;//借出Id
	private String lrNumber;//借出记录单号
	private int dvdId;//DvdID
	private String dvdName;//DVD名称
	private Date lendDate;//借出时间
	private Date retuDate;//预计归还时间
	private int userId;//借出用户ID
	private boolean lrStatus;//借出记录状态
	public LendRecord() {
		super();
	}
	public LendRecord(String lendRecord, int lrId, String lrNumber, String dvdName, Date lendDate, Date retuDate,
			int userId, boolean lrStatus) {
		super();
		this.lendRecord = lendRecord;
		this.lrId = lrId;
		this.lrNumber = lrNumber;
		this.dvdName = dvdName;
		this.lendDate = lendDate;
		this.retuDate = retuDate;
		this.userId = userId;
		this.lrStatus = lrStatus;
	}
	public LendRecord(String lendRecord, int lrId, String lrNumber, int dvdId, String dvdName, Date lendDate,
			Date retuDate, int userId, boolean lrStatus) {
		super();
		this.lendRecord = lendRecord;
		this.lrId = lrId;
		this.lrNumber = lrNumber;
		this.dvdId = dvdId;
		this.dvdName = dvdName;
		this.lendDate = lendDate;
		this.retuDate = retuDate;
		this.userId = userId;
		this.lrStatus = lrStatus;
	}
	public String getLendRecord() {
		return lendRecord;
	}
	public void setLendRecord(String lendRecord) {
		this.lendRecord = lendRecord;
	}
	public int getLrId() {
		return lrId;
	}
	public void setLrId(int lrId) {
		this.lrId = lrId;
	}
	public String getLrNumber() {
		return lrNumber;
	}
	public void setLrNumber(String lrNumber) {
		this.lrNumber = lrNumber;
	}
	public int getDvdId() {
		return dvdId;
	}
	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}
	public String getDvdName() {
		return dvdName;
	}
	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}
	public Date getLendDate() {
		return lendDate;
	}
	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}
	public Date getRetuDate() {
		return retuDate;
	}
	public void setRetuDate(Date retuDate) {
		this.retuDate = retuDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public boolean isLrStatus() {
		return lrStatus;
	}
	public void setLrStatus(boolean lrStatus) {
		this.lrStatus = lrStatus;
	}
	@Override
	public String toString() {
		return "LendRecord [lendRecord=" + lendRecord + ", lrId=" + lrId + ", lrNumber=" + lrNumber + ", dvdId=" + dvdId
				+ ", dvdName=" + dvdName + ", lendDate=" + lendDate + ", retuDate=" + retuDate + ", userId=" + userId
				+ ", lrStatus=" + lrStatus + "]";
	}
	@Override
	public int compareTo(LendRecord o) {
		// TODO Auto-generated method stub
		return this.getLendDate().compareTo(o.getLendDate());
	}
	
}
