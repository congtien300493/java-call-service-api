package com.mkyong;

public class Response {
/*
    "refId": "123fssdgsssd4dsfsff0gsftfddfdf81115",
   "maloi": 0,
   "noidung": "Thoa dieu kien chuyen khoan"
 * */
	private String refId;
	private long maloi;
	private String noidung;
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public long getMaloi() {
		return maloi;
	}
	public void setMaloi(long maloi) {
		this.maloi = maloi;
	}
}
