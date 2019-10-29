package ru.mipt.springdemo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonService {
    private final PersonDao personDao;
}
