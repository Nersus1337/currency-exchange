package ru.currencyExchange.project.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "exchangeRates")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ExchangeRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private double rate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "BaseCurrencyId", nullable = false)
    private Currency BaseCurrency;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TargetCurrencyId", nullable = false)
    private Currency TargetCurrency;

}
