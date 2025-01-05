package com.pastebin;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "testp")
public class Testing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hello;
}
