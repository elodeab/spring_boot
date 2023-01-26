package com.nildev.spbootproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class SpbootprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbootprojApplication.class, args);
	}

	@GetMapping("/")
	public GreetResponse greet(){
		return new GreetResponse("Hello!",
				List.of("Java","Golang","JS"),
				new Person("nil",22,22.3));
	}

	record Person(String name, int age, double savings){}

	record GreetResponse(
			String greet,
			List<String> favProgLang,
			Person person
	){


	}

	/*
	class GreetResponse{

		public GreetResponse(String greet) {
			this.greet = greet;
		}

		@Override
		public String toString() {
			return "GreetResponse{" +
					"greet='" + greet + '\'' +
					'}';
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			GreetResponse that = (GreetResponse) o;
			return Objects.equals(greet, that.greet);
		}

		@Override
		public int hashCode() {
			return Objects.hash(greet);
		}

		public String getGreet() {
			return greet;
		}

		private final String greet;

	}
	*/

}
