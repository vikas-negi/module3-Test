package com.example.RailwayReservationSystem_157753_1;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Reservation")                        // Name of the collection inside the RRdb database
public class RailwayReservation {

		@Id
		private String pnrno;                         // pnrNo as id
		private String passenger_name;
		private String source_loc;
		private String desc_loc;
		private double price;
		@Override
		public String toString() {
			return "RailwayReservation [pnrno=" + pnrno + ", passenger_name="
					+ passenger_name + ", source_loc=" + source_loc
					+ ", desc_loc=" + desc_loc + ", price=" + price + "]";
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
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public RailwayReservation(String pnrno, String passenger_name,
				String source_loc, String desc_loc, double price) {
			super();
			this.pnrno = pnrno;
			this.passenger_name = passenger_name;
			this.source_loc = source_loc;
			this.desc_loc = desc_loc;
			this.price = price;
		}
		public RailwayReservation() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
