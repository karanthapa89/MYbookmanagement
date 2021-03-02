package com.cg.bsmjdbc.service;

import com.cg.bsmjdbc.model.Book;
import com.cg.bsmjdbc.exception.BookStoreException;

import java.util.List;

public interface IBookService {	
	String add(Book book) throws BookStoreException;
	boolean delete(String bcode) throws BookStoreException;
	Book get(String bcode) throws BookStoreException;
	List<Book> getAll() throws BookStoreException;;
	boolean update(Book book) throws BookStoreException;
	void persist()throws BookStoreException;
}