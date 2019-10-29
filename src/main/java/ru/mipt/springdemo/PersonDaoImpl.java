package ru.mipt.springdemo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonDaoImpl implements PersonDao {
    public final String url;
    @Override
    public Person getById(int id) {
        return null;
    }
}
