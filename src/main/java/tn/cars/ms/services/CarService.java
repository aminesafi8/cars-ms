package tn.cars.ms.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.cars.ms.entities.Car;
import tn.cars.ms.repositories.CarRepository;

@Service
public class CarService {
	Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	CarRepository carRepository;

	public void addUser(Car car) {
		carRepository.save(car);
		log.info("car added");
	}
	
	
	public Car getCarByImmatricule(String plate) {
		return carRepository.findByPlate(plate).get(0);
	}

}
