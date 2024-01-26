package ru.currencyExchange.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.currencyExchange.project.entity.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {


}
