package com.example.mapper;

import com.example.pojo.Type;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface TypeMapper {

    public List<Type> findAll();

}
