package com.example.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.BookRepository;



@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean 
	public CommandLineRunner demo(BookRepository repository) {
		return (args)->{
			
			log.info("Säästetään muutama kirja");
			Book b0 = new Book("Testikirja", "Testaaja", 1993, 19930207,19.93);
			Book b1 = new Book("Testikirja2", "Testaaja2", 1994, 19930208,20.00);
			
			repository.save(b0);
			repository.save(b1);
			for (Book book: repository.findAll()) {
			log.info(book.toString());
			}
		};
	}

}
