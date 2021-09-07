package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type implements Serializable {

    private int id;
    //类型名称
    private String name;
    //排序
    private int sort;

    private List<Link> links;

}
