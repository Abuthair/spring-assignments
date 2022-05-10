package com.restaurantapp.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="item")
public class Item {
    @Id
    @GeneratedValue(generator = "item_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "item_gen",sequenceName = "item_sequence",initialValue = 100,allocationSize = 2)
    private Integer itemId;
    @Column(length = 20)
    private String itemName;
    @Enumerated(EnumType.STRING)
    private Category category;
    @Enumerated(EnumType.STRING)
    private Type itemType;
    private double price;

    public Item(String itemName, Category category, Type itemType, double price) {
        this.itemName = itemName;
        this.category = category;
        this.itemType = itemType;
        this.price = price;
    }
}



