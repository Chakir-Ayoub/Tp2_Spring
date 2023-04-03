package com.example.demo.service;

import java.util.List;

public interface Dao<T> {
	T Save(T t);
	T Update(Integer id,T t);
	void Delete(Integer id);
	T GetById(Integer id);
	List<T> GetAll();
}
