package com.arun.springjdbcvsjpawithhibernate.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cricket {

    private String name;
    private String country;
    private int score;
    private int matches;
    private double average;
}
