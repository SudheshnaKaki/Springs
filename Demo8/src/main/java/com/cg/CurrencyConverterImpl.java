package com.cg;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CurrencyConverterImpl implements CurrencyConverter {
	@Autowired
	private ExchangeServiceImpl exchangeService;
	
	@Autowired
	public void currencyConverterImpl(ExchangeServiceImpl exchangeService) {
		System.out.println("setExchangeService()");
		this.exchangeService = exchangeService;
	}

	public double dollarsToRupees(double dollars) {
		// TODO Auto-generated method stub
		System.out.println("dollarsToRupees()");
		return dollars * exchangeService.getExchangeRate();
	}
	@PostConstruct
	void init(){
		System.out.println("in init() - called thru @PostConstruct");
	}
	@PreDestroy
	void destroy() {
		System.out.println("in destroy() - called thru @PreConstruct");
	}

}
