package com.example.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id ;
private String title;
private String author;
private int year;
private int isbn;
private double price;

public Book() {}

public Book(String title, String author, int year, int isbn, double price) {
	super();
	this.title = title;
	this.author = author;
	this.year = year;
	this.isbn = isbn;
	this.price = price;
}
public long getId() {
	return id;
}
public String getTitle() {
	return title;
}
public String getAuthor() {
	return author;
}
public int getYear() {
	return year;
}
public int getIsbn() {
	return isbn;
}
public double getPrice() {
	return price;
}
public void setId(long id) {
	this.id = id;
}
public void setTitle(String title) {
	this.title = title;
}
public void setAuthor(String author) {
	this.author = author;
}
public void setYear(int year) {
	this.year = year;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public void setPrice(double price) {
	this.price = price;
}
@Override 
public String toString() {
	return "Book id=" + id + ", Title=" + title + ", Author=" + author+ ", Year="+ year +", Isbn="+ isbn + ", Price="+ price;
}

}
