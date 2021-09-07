package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Link implements Serializable {

    private int id;
    //分类id
    private int typeId;
    //图表顺序1-5
    private int icon;
    //标题
    private String title;
    //描述
    private String description;
    //访问次数
    private int count;
    //排序
    private int sort;
    //链接内容
    private String content;
}
