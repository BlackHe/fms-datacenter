package com.exchange.datacenter.bean;

import java.math.BigDecimal;

public class Currency {
    private String currency;
    private String currencyName;


    public Currency(String currency, String currencyName) {
        this.currency = currency;
        this.currencyName = currencyName;

    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

}
