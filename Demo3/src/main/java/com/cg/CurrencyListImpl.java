package com.cg;

import java.util.ArrayList;
import java.util.List;

public class CurrencyListImpl implements CurrencyList {
	
	private CurrencyList currencyList;
	
	List<String> currList = new ArrayList<String>();
	
	public void setCurrList(List<String> currList) {
		this.currList = currList;
	}
	public List<String> getCurrList() {
		// TODO Auto-generated method stub
		return currList;
	}

}
