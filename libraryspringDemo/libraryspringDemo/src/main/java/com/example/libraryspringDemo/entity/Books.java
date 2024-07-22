package com.example.libraryspringDemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "books")
//@Table
@Getter
@Setter
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "borrowed")
    private boolean borrowed;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private int author_id;


    public Books() {
    }

    public Books(String title, int quantity, boolean borrowed) {
        this.title = title;
        this.quantity = quantity;
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", quantity=" + quantity +
                ", borrowed=" + borrowed +
                ", author_id=" + author_id +
                '}';
    }
}
