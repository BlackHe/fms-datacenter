package com.exchange.datacenter.bean;

public class MinerFee {
    private String coinName;
    private String sweepFee;
    private String sweepInternalFee;
    private String id;

    public String getCoinName() {
        return coinName;
    }

    public MinerFee(String coinName, String sweepFee, String sweepInternalFee, String id) {
        this.coinName = coinName;
        this.sweepFee = sweepFee;
        this.sweepInternalFee = sweepInternalFee;
        this.id = id;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getSweepFee() {
        return sweepFee;
    }

    public void setSweepFee(String sweepFee) {
        this.sweepFee = sweepFee;
    }

    public String getSweepInternalFee() {
        return sweepInternalFee;
    }

    public void setSweepInternalFee(String sweepInternalFee) {
        this.sweepInternalFee = sweepInternalFee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
