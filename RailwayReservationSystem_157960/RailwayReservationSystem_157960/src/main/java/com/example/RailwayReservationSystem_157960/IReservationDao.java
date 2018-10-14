package com.example.RailwayReservationSystem_157960;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface IReservationDao extends MongoRepository<ReservationDetails,String> {
		
}
