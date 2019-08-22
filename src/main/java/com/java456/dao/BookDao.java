package com.java456.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.java456.entity.Book;

public interface BookDao extends JpaRepository<Book,Integer>,JpaSpecificationExecutor< Book> {

}
