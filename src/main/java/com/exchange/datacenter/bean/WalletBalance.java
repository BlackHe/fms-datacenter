package com.exchange.datacenter.bean;

public class WalletBalance {

    private String coinName;
    private String balance;
    private String date;


    public WalletBalance(String coinName, String balance, String date) {
        this.coinName = coinName;
        this.balance = balance;
        this.date = date;
    }

    public String getCoinName() {
        return coinName;
    }

    public WalletBalance setCoinName(String coinName) {
        this.coinName = coinName;
        return this;
    }


    public String getBalance() {
        return balance;
    }

    public WalletBalance setBalance(String balance) {
        this.balance = balance;
        return this;
    }

    public String getDate() {
        return date;
    }

    public WalletBalance setDate(String date) {
        this.date = date;
        return this;
    }
}
