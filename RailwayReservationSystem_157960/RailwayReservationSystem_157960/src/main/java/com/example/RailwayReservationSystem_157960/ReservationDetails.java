package com.example.RailwayReservationSystem_157960;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Details of Passenger
@Document(collection="Reservation")
public class ReservationDetails {
	@Id  
	private String pnrno;
	private String passenger_name;
	private String source_loc;
	private String desc_loc;
	private int price;
	public ReservationDetails(String pnrno, String passenger_name,
			String source_loc, String desc_loc, int price) {
		super();
		this.pnrno = pnrno;
		this.passenger_name = passenger_name;
		this.source_loc = source_loc;
		this.desc_loc = desc_loc;
		this.price = price;
	}
	public ReservationDetails() {
		super();
	}
	public String getPnrno() {
		return pnrno;
	}
	public void setPnrno(String pnrno) {
		this.pnrno = pnrno;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public String getSource_loc() {
		return source_loc;
	}
	public void setSource_loc(String source_loc) {
		this.source_loc = source_loc;
	}
	public String getDesc_loc() {
		return desc_loc;
	}
	public void setDesc_loc(String desc_loc) {
		this.desc_loc = desc_loc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
