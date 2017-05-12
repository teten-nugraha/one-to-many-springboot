/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teten.repository;

import com.teten.entity.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gecko
 */
public interface BookRepository extends JpaRepository<Book,Integer>{
    List<Book> findByName(String name);
}
