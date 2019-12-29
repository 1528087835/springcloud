package com.it.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private int id;

    private String name;

    private Integer age;

    private Date day;

}
