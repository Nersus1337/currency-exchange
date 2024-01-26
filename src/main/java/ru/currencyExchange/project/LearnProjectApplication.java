package ru.currencyExchange.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.currencyExchange.project.entity.Currency;
import ru.currencyExchange.project.entity.ExchangeRate;
import ru.currencyExchange.project.service.CurrencyService;
import ru.currencyExchange.project.service.ExchangeRateService;

@SpringBootApplication
public class LearnProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LearnProjectApplication.class, args);
	}

	CurrencyService currencyService;
	ExchangeRateService exchangeRateService;

	@Autowired
	public LearnProjectApplication(CurrencyService currencyService, ExchangeRateService exchangeRateService) {
		this.currencyService = currencyService;
		this.exchangeRateService = exchangeRateService;
	}

	@Override
	public void run(String... args) throws Exception {

//		currencyService.add(new Currency(null, "AFN", "Afghani", "Af"));
//		currencyService.add(new Currency(null, "ALL", "Lek", "Al"));
//		currencyService.add(new Currency(null, "DZD", " Algerian Dinar", "Dz"));
//		currencyService.add(new Currency(null, "USD", "US Dollar", "Us"));

		exchangeRateService.add(new ExchangeRate(null, 1, currencyService.getById(1L).get(), currencyService.getById(1L).get()));
		exchangeRateService.add(new ExchangeRate(null, 0.42, currencyService.getById(1L).get(), currencyService.getById(2L).get()));
		exchangeRateService.add(new ExchangeRate(null, 0.99, currencyService.getById(1L).get(), currencyService.getById(3L).get()));
		exchangeRateService.add(new ExchangeRate(null, 2.87, currencyService.getById(1L).get(), currencyService.getById(4L).get()));

		System.out.println("Currencies: " + currencyService.getAll());
		System.out.println("Rates: " + exchangeRateService.getAll());
	}

}
