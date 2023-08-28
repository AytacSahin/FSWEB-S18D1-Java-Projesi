package com.workintech.burger.entity;


import jakarta.persistence.*;
import lombok.Data; // getter setter to-string hash hepsini koydu
import lombok.NoArgsConstructor; // argümansız boş constructor

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "burger", schema = "workintech") // spring bir şema. Bu şema altında topladık tabloları.
// Burger sınıfının veritabanındaki tablo adının burger olduğunu ve spring şeması altında bulunması gerektiğini söyledim.
// Eğer @Table kullanmasaydım tablo adı Burger olucaktı.

public class Burger {

    @Id // primary key tanımlarız.Her kaydı benzersiz tanımlar.
    @GeneratedValue(strategy = GenerationType.IDENTITY ) // Birincil anahtarın nasıl otomatik oluşturulacağını anlatırız.
    @Column(name = "id") // 1- Bunun bir kolon olduğunu anlatıyoruz. 2- Bu kolon adının "id" olduğunu söylüyoruz.
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "is_vegan")
    private boolean isVegan;

    @Enumerated(EnumType.STRING)
    private BreadType breadType;

    @Column(name = "contents")
    private List<String> contents;
}
