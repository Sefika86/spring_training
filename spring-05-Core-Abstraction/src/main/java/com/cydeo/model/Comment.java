package com.cydeo.model;

import lombok.Data;

@Data
public class Comment {
    private String author;
    private String text;
}

//we don't need to put @Component in this class because it is never injected
// in other classes by creating a field with its name(no DI: Dependency Injection)