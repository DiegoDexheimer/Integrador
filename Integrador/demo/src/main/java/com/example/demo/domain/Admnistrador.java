package com.example.demo.domain;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
public class Admnistrador extends User {

    @Builder.Default
    private boolean is_adm = true;
}
