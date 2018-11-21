package com.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("exchangeService")
public class ExchangeServiceImpl implements ExchangeService {
	
	@Value("44.25")
	private double exchangeRate;
	
	public double getExchangeRate() {
		System.out.println("getExchangedRate()");
		return exchangeRate;
	}
	/*public ExchangeServiceImpl(double exchangeRate) {
		
		System.out.println("ExchangeServiceImpl()");
		this.exchangeRate = exchangeRate;
	}
*/
	
}
