package ru.currencyExchange.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.currencyExchange.project.entity.ExchangeRate;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {


}
