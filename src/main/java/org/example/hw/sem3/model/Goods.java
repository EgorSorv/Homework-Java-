package org.example.hw.sem3.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goods {
    private String name;
    private int cost;
    private int sort;
}
