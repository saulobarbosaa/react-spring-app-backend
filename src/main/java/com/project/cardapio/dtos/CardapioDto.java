package com.project.cardapio.dtos;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CardapioDto {
    private Long id;
    private String title;
    private String image;
    private Integer price;
}
