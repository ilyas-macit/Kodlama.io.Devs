package com.example.demo.dataAccess.abstracts;

import com.example.demo.entity.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageDal {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);
}
