package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class Jogador extends User {

  //  @OneToOne(mappedBy = "pet_id")
  //  private Pet pet;
    
    @OneToOne(mappedBy = "usuario")
    private Inventario inventario;

    @Builder.Default
    private boolean is_adm = false;
}
