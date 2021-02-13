package br.com.caelum.eatsconfig.eatsconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EatsConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EatsConfigApplication.class, args);
	}

}
