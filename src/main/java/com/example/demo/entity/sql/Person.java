package com.example.demo.entity.sql;

import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.Size;

@Entity
@Table(name="person")
@Data
public class Person {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "field_name", unique = true)
    @Size(max = 10)
    private String name;

    private Long phone;
}
