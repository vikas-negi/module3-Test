package com.example.RailwayReservationSystem_157960;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class ReservationService {
		@Autowired
		IReservationDao reservationDao;
		
		//Inserting Records into db
		@PostMapping("/insert/{id}")
		public String insert(@RequestBody ReservationDetails rd)
		{
			reservationDao.save(rd);
			return "Succesfully Inserted";
		}
		
		//Retrieving records
		@GetMapping(value="/select/{pnrno}")
		public ReservationDetails findById(@PathVariable("pnrno") String pnrno) throws Exception
		{
			try
			{
				ReservationDetails rd = reservationDao.findById(pnrno).get();
				System.out.println("Success");
				return rd;
			}
			catch(Exception e)
			{
				throw new ReservationException("PNR Not Found wrong PnrNo : "+pnrno);
			}
		}
}
