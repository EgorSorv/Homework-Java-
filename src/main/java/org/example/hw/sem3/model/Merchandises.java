package org.example.hw.sem3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Merchandises {
    private String name;
    private String manufacturerCountry;
    private int weight;
    private int cost;
    private int sort;
}
