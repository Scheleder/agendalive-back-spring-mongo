package com.spring.agendalive;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.agendalive.document.LiveDocument;
import com.spring.agendalive.repository.LiveRepository;

@SpringBootApplication
public class AgendaliveApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AgendaliveApplication.class, args);
		
	}

	@Autowired
    LiveRepository liveRepository;
	
	String livename = "Curso Angular";
	String channelName = "Teste";
	LocalDateTime liveDate = LocalDateTime.now().plusDays(-3);
	String liveLink = "https://www.youtube.com/embed/NTSgTRpUsbc";
	LocalDateTime registrationDate = LocalDateTime.now();

	LiveDocument live = new LiveDocument(livename, channelName, liveDate, liveLink, registrationDate);


	@Override
	public void run(String... args) throws Exception {
		System.out.println("#####################################################");
		System.out.println("# Hello World - API REST WITH MONGODB IN LOCALHOST! #");
		System.out.println("#####################################################");
		//this.liveRepository.save(live);
		
	}

}
