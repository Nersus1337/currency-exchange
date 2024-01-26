package ru.currencyExchange.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.currencyExchange.project.entity.Currency;
import ru.currencyExchange.project.entity.ExchangeRate;
import ru.currencyExchange.project.repository.ExchangeRateRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ExchangeRateService {

    ExchangeRateRepository exchangeRateRepository;

    @Autowired
    public ExchangeRateService(ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateRepository = exchangeRateRepository;
    }

    public void add(ExchangeRate exchangeRate){
        exchangeRateRepository.save(exchangeRate);
    }

    public List<ExchangeRate> getAll(){
        return exchangeRateRepository.findAll();
    }

    public Optional<ExchangeRate> getById(Long id){
        return exchangeRateRepository.findById(id);
    }
}
