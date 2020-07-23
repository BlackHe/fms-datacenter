package com.exchange.datacenter.bean;

public class RechargeUnexpected {
    private String coinName;
    private String amount;
    private String id;

    public RechargeUnexpected(String coinName, String amount,String id) {
        this.coinName = coinName;
        this.amount = amount;
        this.id = id;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
