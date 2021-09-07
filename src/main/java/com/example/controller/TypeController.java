package com.example.controller;

import com.example.pojo.Type;
import com.example.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class TypeController{

    @Autowired
    TypeService typeService;

    @GetMapping(value = {"","index"})
    public String findAll(ModelMap mmap) {
        List<Type> all = typeService.findAll();
        mmap.put("typelinks",all);
        return "index";
    }
}
