package com.example.demo.domain;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

/*@Entity
@Data
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private User user;

    @OneToMany(mappedBy = "inventario")
    private List<Item> itens;


}*/
@Entity
@Data
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;

    @ManyToMany
    @JoinTable(
        name = "inventario_item",
        joinColumns = @JoinColumn(name = "inventario_id"),
        inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    private List<Item> itens;

}
