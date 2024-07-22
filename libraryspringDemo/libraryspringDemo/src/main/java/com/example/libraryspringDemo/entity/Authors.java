package com.example.libraryspringDemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "author")
@Getter
@Setter
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name_author;

    public Authors() {
    }

    public Authors(int id, String name_author) {
        this.id = id;
        this.name_author = name_author;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "id=" + id +
                ", name_author='" + name_author + '\'' +
                '}';
    }
}
