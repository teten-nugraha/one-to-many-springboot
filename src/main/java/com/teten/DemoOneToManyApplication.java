package com.teten;

import com.teten.entity.Book;
import com.teten.entity.BookCategory;
import com.teten.repository.BookCategoryRepository;
import com.teten.repository.BookRepository;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class DemoOneToManyApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(DemoOneToManyApplication.class);

    @Autowired
    private BookCategoryRepository bookCategoryRepository;
    
    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoOneToManyApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... strings) throws Exception {
        // save a couple of categories
//        BookCategory categoryA = new BookCategory("Category A");
//        Set bookAs = new HashSet<Book>(){{
//            add(new Book("Book A1", categoryA));
//            add(new Book("Book A2", categoryA));
//            add(new Book("Book A3", categoryA));
//        }};
//        categoryA.setBooks(bookAs);
//
//        BookCategory categoryB = new BookCategory("Category B");
//        Set bookBs = new HashSet<Book>(){{
//            add(new Book("Book B1", categoryB));
//            add(new Book("Book B2", categoryB));
//            add(new Book("Book B3", categoryB));
//        }};
//        categoryB.setBooks(bookBs);
//
//        bookCategoryRepository.save(new HashSet<BookCategory>() {{
//            add(categoryA);
//            add(categoryB);
//        }});
//
//        // fetch all categories
//        for (BookCategory bookCategory : bookCategoryRepository.findAll()) {
//            logger.info(bookCategory.toString());
//        }
        
        // fetch all books
//        for(Book book : bookRepository.findAll()) {
//            logger.info("Book ID="+book.getId()+" Name:"+book.getName()+" Kategori = "+book.getBookCategory().getName());
//        }

         // find by name
         List books = bookRepository.findByName("Book A1");
         for (int i = 0; i < books.size(); i++) {
            logger.info("Book ID="+books.get(i).+" Name:"+book.getName()+" Kategori = "+book.getBookCategory().getName());
        }
    }
}
