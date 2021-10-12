package com.example.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.BookRepository;
import com.example.bookstore.domain.Category;
import com.example.bookstore.domain.CategoryRepository;



@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean 
	public CommandLineRunner demo(BookRepository brepository, CategoryRepository crepository) {
		return (args)->{
			
			log.info("Säästetään muutama kirja");
			
			crepository.save(new Category("Horror"));
			crepository.save(new Category("Scifi"));
			
			brepository.save(new Book ("Testikirja", "Testaaja", 1993, 19930207,19.93, crepository.findByName("Horror").get(0)));
			brepository.save(new Book ("Testikirja2", "Testaaja2", 1994, 19930208,20.00, crepository.findByName("Scifi").get(0)));
			
			
			for (Book book: brepository.findAll()) {
			log.info(book.toString());
			}
		};
	}

}
