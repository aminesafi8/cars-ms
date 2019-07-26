package tn.cars.ms.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tn.cars.ms.entities.Car;
import tn.cars.ms.entities.User;
@Repository
public interface CarRepository extends MongoRepository<Car, String> {
	
	List<Car> findByPlate(String plate);
	

}
