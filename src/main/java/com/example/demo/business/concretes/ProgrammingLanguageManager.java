package com.example.demo.business.concretes;

import com.example.demo.business.abstracts.ProgrammingLanguageService;
import com.example.demo.dataAccess.abstracts.ProgrammingLanguageDal;
import com.example.demo.entity.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    ProgrammingLanguageDal programmingLanguageDal;

    public ProgrammingLanguageManager(ProgrammingLanguageDal programmingLanguageDal) {
        this.programmingLanguageDal = programmingLanguageDal;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageDal.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageDal.getById(id);
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        boolean isExist = false;
        for(ProgrammingLanguage item : programmingLanguageDal.getAll()){
            if(item.getName() == programmingLanguage.getName()){
                isExist = true;
            }
        }

        if(programmingLanguage != null && !isExist){
            programmingLanguageDal.add(programmingLanguage);
        }
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        programmingLanguageDal.update(programmingLanguage);
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguageDal.delete(programmingLanguage);
    }
}
