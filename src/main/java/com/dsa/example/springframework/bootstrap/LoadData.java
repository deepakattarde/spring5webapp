package com.dsa.example.springframework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dsa.example.springframework.model.Author;
import com.dsa.example.springframework.model.Book;
import com.dsa.example.springframework.model.Publisher;
import com.dsa.example.springframework.repository.AuthorRepository;
import com.dsa.example.springframework.repository.BookRepository;
import com.dsa.example.springframework.repository.PublisherRepository;

@Component
public class LoadData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	public LoadData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		Author author1 = new Author("Deepak", "Attarde");
		Book lswm = new Book("Learn Spring Web MVC", "1234");
		
		author1.getBooks().add(lswm);
		lswm.getAuthors().add(author1);
		
		authorRepository.save(author1);
		bookRepository.save(lswm);
		
		Author author2 = new Author("Kapeed", "Edratta");
		Book reversing = new Book("Reversing", "5678");
		
		author2.getBooks().add(reversing);
		reversing.getAuthors().add(author2);
		
		authorRepository.save(author2);
		bookRepository.save(reversing);
		
		System.out.println("Data added.... Books: "+bookRepository.count());

		Publisher grtPub = new Publisher("Great Publishers", "123 Great St", "better", "GT", 5678);
		grtPub.getBooks().add(lswm);
		grtPub.getBooks().add(reversing);
		
		publisherRepository.save(grtPub);
		
		System.out.println("Data added.... Publisher: "+grtPub.getBooks().size());
	}

}
