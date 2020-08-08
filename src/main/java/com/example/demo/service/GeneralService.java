package com.example.demo.service;

public interface GeneralService<E> {

    Iterable<E> findAll();

    E findById(Long id);

    void save(E e);

    void delete(Long id);
}
