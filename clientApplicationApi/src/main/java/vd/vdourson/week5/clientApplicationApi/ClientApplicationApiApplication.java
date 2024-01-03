package vd.vdourson.week5.clientApplicationApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplicationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplicationApiApplication.class, args);
		RestConsumer.getDoctorsAsJson();
		RestConsumer.createDoctor();
		RestConsumer.getDoctorsAsJson();
	}
}
