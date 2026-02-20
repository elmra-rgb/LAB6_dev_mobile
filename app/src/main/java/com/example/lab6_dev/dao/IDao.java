package com.example.lab6_dev.dao;

import java.util.List;

public interface IDao<T> {
    T creer(T t);
    T modifier(T t);
    boolean supprimer(long id);
    T trouverParId(long id);
    List<T> trouverTous();
}