package com.cg;

public class CurrencyConverterImpl implements CurrencyConverter {

	private ExchangeService exchangeService;
	
	public CurrencyConverterImpl() {
		System.out.println("CurrencyConventerImpl()");
	}
	
	public ExchangeService getExchangeService() {
		System.out.println("getExchangeService()");
		return exchangeService;
	}

	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("setExchangeService()");
		this.exchangeService = exchangeService;
	}

	public double dollarsToRupees(double dollars) {
		// TODO Auto-generated method stub
		System.out.println("dollarsToRupees()");
		return dollars * exchangeService.getExchangeRate();
	}

}
