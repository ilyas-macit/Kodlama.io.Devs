package com.example.demo.dataAccess.concretes;

import com.example.demo.dataAccess.abstracts.ProgrammingLanguageDal;
import com.example.demo.entity.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageDal {
    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguage() {
        programmingLanguages = new ArrayList<>();
        programmingLanguages.add(new ProgrammingLanguage(1, "Python"));
        programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(3, "C#"));

    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        for (ProgrammingLanguage item : programmingLanguages) {
            if (item.getId() == id) {
                programmingLanguage = item;
            }
        }
        return programmingLanguage;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage updatedProgrammingLanguage = new ProgrammingLanguage();
        for (ProgrammingLanguage item : programmingLanguages) {
            if (item.getId() == programmingLanguage.getId()) {
                updatedProgrammingLanguage = item;
            }
        }
        updatedProgrammingLanguage.setId(programmingLanguage.getId());
        updatedProgrammingLanguage.setName(programmingLanguage.getName());
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage deletedProgrammingLanguage = new ProgrammingLanguage();
        for (ProgrammingLanguage item : programmingLanguages) {
            if (item.getId() == programmingLanguage.getId()) {
                deletedProgrammingLanguage = item;
            }
        }
        programmingLanguages.remove(deletedProgrammingLanguage);
    }
}
