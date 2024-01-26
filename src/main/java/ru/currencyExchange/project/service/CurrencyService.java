package ru.currencyExchange.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.currencyExchange.project.entity.Currency;
import ru.currencyExchange.project.repository.CurrencyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CurrencyService {

    CurrencyRepository currencyRepository;

    @Autowired
    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public void add(Currency currency){
        currencyRepository.save(currency);
    }

    public List<Currency> getAll(){
        return currencyRepository.findAll();
    }

    public Optional<Currency> getById(Long id){
        return currencyRepository.findById(id);
    }

}
