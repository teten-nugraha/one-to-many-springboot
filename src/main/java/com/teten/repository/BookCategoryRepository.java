/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teten.repository;

import com.teten.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gecko
 */
@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer>{
    
}
