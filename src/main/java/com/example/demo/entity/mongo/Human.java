package com.example.demo.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "person")
@Data
public class Human {
    @Id
    private String id;
    private String name;

    private Long phone;
}
