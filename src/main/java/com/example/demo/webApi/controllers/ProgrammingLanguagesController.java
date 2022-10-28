package com.example.demo.webApi.controllers;

import com.example.demo.business.abstracts.ProgrammingLanguageService;
import com.example.demo.dataAccess.abstracts.ProgrammingLanguageDal;
import com.example.demo.entity.concretes.ProgrammingLanguage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
    ProgrammingLanguageService programmingLanguageService;

    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }
    @GetMapping("/programminglanguage")
    ProgrammingLanguage getById(@RequestParam int id){
        return programmingLanguageService.getById(id);
    }
    @PostMapping("/add")
    void add(@RequestBody ProgrammingLanguage programmingLanguage){
        programmingLanguageService.add(programmingLanguage);
    }

    @DeleteMapping("/delete")
    void delete(@RequestBody ProgrammingLanguage programmingLanguage){
        programmingLanguageService.delete(programmingLanguage);
    }

    @PutMapping("/update")
    void update(@RequestBody ProgrammingLanguage programmingLanguage)
    {
        programmingLanguageService.update(programmingLanguage);
    }


}
