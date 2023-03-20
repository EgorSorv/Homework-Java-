package org.example.hw.sem3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Books {
    private String bookName;
    private String authorSurname;
    private int cost;
    private int year;
    private int pages;
}
