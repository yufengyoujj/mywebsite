package com.example.service;

import com.example.mapper.TypeMapper;
import com.example.pojo.Type;
import jdk.nashorn.internal.codegen.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {

    @Autowired
    private TypeMapper typeMapper;

    public List<Type> findAll() {
        return typeMapper.findAll();
    }
}
