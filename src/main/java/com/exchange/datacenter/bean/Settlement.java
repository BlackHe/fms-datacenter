package com.exchange.datacenter.bean;

public class Settlement {

    private String coinName;
    private String amount;
    private String fee;
    private String feeCoinName;
    private String tradingDate;
    private String direction;
    private String blockChainFee;
    private String id;
    private String blockChainFeeType;

    private String registeredName;

    private String clientId;

    public String getCoinName() {
        return coinName;
    }

    public Settlement setCoinName(String coinName) {
        this.coinName = coinName;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public Settlement setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getFee() {
        return fee;
    }

    public Settlement setFee(String fee) {
        this.fee = fee;
        return this;
    }

    public String getFeeCoinName() {
        return feeCoinName;
    }

    public Settlement setFeeCoinName(String feeCoinName) {
        this.feeCoinName = feeCoinName;
        return this;
    }

    public String getTradingDate() {
        return tradingDate;
    }

    public Settlement setTradingDate(String tradingDate) {
        this.tradingDate = tradingDate;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public Settlement setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getBlockChainFee() {
        return blockChainFee;
    }

    public Settlement setBlockChainFee(String blockChainFee) {
        this.blockChainFee = blockChainFee;
        return this;
    }

    public String getId() {
        return id;
    }

    public Settlement setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public Settlement setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public Settlement setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
        return this;
    }

    public String getBlockChainFeeType() {
        return blockChainFeeType;
    }

    public Settlement setBlockChainFeeType(String blockChainFeeType) {
        this.blockChainFeeType = blockChainFeeType;
        return this;
    }
}
