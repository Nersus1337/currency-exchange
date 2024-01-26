package ru.currencyExchange.project.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "currencies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotBlank
    private String code;

    @NotBlank
    private String fullName;

    @NotBlank
    private String sign;

}
