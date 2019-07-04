package org.cap.order;

import java.time.LocalDate;

public class OrderProcess {
	private int oNo;
	private String orderName;
	private LocalDate oDate;
	public int getoNo() {
		return oNo;
	}
	public void setoNo(int oNo) {
		this.oNo = oNo;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public LocalDate getoDate() {
		return oDate;
	}
	public void setoDate(LocalDate oDate) {
		this.oDate = oDate;
	}
	@Override
	public String toString() {
		return "OrderProcess [oNo=" + oNo + ", orderName=" + orderName + ", oDate=" + oDate + "]";
	}
	

}
