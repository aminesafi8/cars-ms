package tn.cars.ms.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.cars.ms.entities.Car;
import tn.cars.ms.services.CarService;

@RestController
@RequestMapping("car")
public class CarController {

	@Autowired
	CarService carService;

	@PostMapping
	public ResponseEntity<String> addCar(@RequestBody Car car) {
		carService.addUser(car);
		return new ResponseEntity<String>("car added!", HttpStatus.OK);

	}

	@GetMapping("{plate}")
	public ResponseEntity<Car> getCarByImmatricule(@PathVariable String plate) {

		return new ResponseEntity<Car>(carService.getCarByImmatricule(plate), HttpStatus.OK);

	}

}
