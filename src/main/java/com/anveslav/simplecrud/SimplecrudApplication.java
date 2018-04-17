package com.anveslav.simplecrud;


import com.anveslav.simplecrud.model.Car;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.anveslav.simplecrud.dao.*;


import java.util.stream.Stream;


@SpringBootApplication
public class SimplecrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplecrudApplication.class, args);
	}

	@Bean
	ApplicationRunner init(CarRepository repository){
		return args -> {
			Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
					"AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
				Car car = new Car();
				car.setName(name);
				repository.save(car);
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
