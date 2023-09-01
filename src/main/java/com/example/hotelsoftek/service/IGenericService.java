package com.example.hotelsoftek.service;

import java.util.List;

public interface IGenericService <T, ID>{

    // get all
    List<T> findAll();

    //post
    T save(T t);

    //put
    T update(T t, ID id);

    //Delete
    void deleteById(ID id);
}
