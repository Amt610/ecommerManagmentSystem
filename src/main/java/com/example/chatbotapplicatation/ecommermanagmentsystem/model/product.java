package com.example.chatbotapplicatation.ecommermanagmentsystem.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "product_table")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String category;
    private String imageUrl;
}
