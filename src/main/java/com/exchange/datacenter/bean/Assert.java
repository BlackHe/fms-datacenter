package com.exchange.datacenter.bean;

public class Assert {

    private String coinName;

    private String clientId;

    private String amount;

    private String registeredName;

    public Assert() {
    }

    public Assert(String coinName, String clientId, String amount, String registeredName) {
        this.coinName = coinName;
        this.clientId = clientId;
        this.amount = amount;
        this.registeredName = registeredName;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }
}
