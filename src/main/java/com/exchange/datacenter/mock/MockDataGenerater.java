package com.exchange.datacenter.mock;

import com.exchange.datacenter.bean.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MockDataGenerater {

    public static List generateMockData(Class clazz) {
        switch (clazz.getSimpleName()) {
            case "Assert":
                return assertList();
            case "Trade":
                return tradeList();
            case "Settlement":
                return settlementList();
            case "Activity":
                return activityList();
            case "CompanyInput":
                return companyInputList();
            case "BlockchainFee":
                return blockchainFeeList();
            case "AbnormalTurnedhot":
                return abnormalTurnedhotList();
            case "MinerFee":
                return minerFeeList();
            case "RechargeUnexpected":
                return rechargeUnexpectedList();
            case "Currency":
                return currencyList();
            case "WalletBalance":
                return balanceList();
            default:
                return null;
        }
    }


    public static List<Assert> assertList() {
        ArrayList<Assert> asserts = new ArrayList<>();
        asserts.add(new Assert("BTC", "0000000021", "0.291829", "233333@163.com"));
        asserts.add(new Assert("ETH", "0000000021", "10.9283939", "22222@163.com"));
        asserts.add(new Assert("CYB", "0000000021", "823784.82932", "66777@163.com"));
        asserts.add(new Assert("EOS", "0000000021", "920392.2", "334444@163.com"));
        asserts.add(new Assert("BTC", "0000000022", "2.231232", "22222@qq.com"));
        asserts.add(new Assert("ETH", "0000000022", "9283.99999", "233333@qq.com"));
        asserts.add(new Assert("USDT", "0000000023", "100000.93829", "22222@163.com"));
        asserts.add(new Assert("XTZ", "0000000023", "100000.93829", "22222@163.com"));
        asserts.add(new Assert("BTC", "0000000023", "100000.93829", "222322@163.com"));
        asserts.add(new Assert("BCH", "0000000023", "100000.93829", "222422@163.com"));
        asserts.add(new Assert("BSV", "0000000023", "100000.93829", "222522@163.com"));
        asserts.add(new Assert("ETH", "0000000023", "100000.93829", "222222@163.com"));
        asserts.add(new Assert("Airbnb", "0000000023", "100000.93829", "221222@163.com"));
        asserts.add(new Assert("LTC", "0000000023", "100000.93829", "22222@163.com"));
        asserts.add(new Assert("DOGE", "0000000023", "100000.93829", "226222@163.com"));
        asserts.add(new Assert("DASH", "0000000023", "100000.93829", "222227@163.com"));
        asserts.add(new Assert("XRP", "0000000023", "100000.93829", "222262@163.com"));
        asserts.add(new Assert("XLM", "0000000023", "100000.93829", "272222@163.com"));
        asserts.add(new Assert("XMR", "0000000023", "100000.93829", "222822@163.com"));
        asserts.add(new Assert("ADA", "0000000023", "100000.93829", "222282@163.com"));
        asserts.add(new Assert("ZCASH", "0000000023", "100000.93829", "2227622@163.com"));
        asserts.add(new Assert("mixin", "0000000023", "100000.93829", "2222672@163.com"));
        asserts.add(new Assert("groestlcoin", "0000000023", "100000.93829", "2227622@163.com"));
        asserts.add(new Assert("USDC", "0000000023", "100000.93829", "2228722@163.com"));
        asserts.add(new Assert("ZRX", "0000000023", "100000.93829", "2267222@163.com"));
        asserts.add(new Assert("GNT", "0000000023", "100000.93829", "2672222@163.com"));
        asserts.add(new Assert("AYB", "0000000023", "100000.93829", "27782222@163.com"));
        asserts.add(new Assert("XXB", "0000000023", "100000.93829", "22267522@163.com"));
        asserts.add(new Assert("HBB", "0000000023", "100000.93829", "2226522@163.com"));
        asserts.add(new Assert("QTUM", "0000000023", "100000.93829", "22544222@163.com"));
        asserts.add(new Assert("ATOM", "0000000023", "100000.93829", "2246222@163.com"));
        asserts.add(new Assert("STX", "0000000023", "100000.93829", "2265222@163.com"));
        asserts.add(new Assert("USDT", "0000000023", "1006000.93829", "2672222@163.com"));
        asserts.add(new Assert("LX", "0000000023", "1000600.93829", "2222652@163.com"));
        asserts.add(new Assert("YLL", "00000600023", "100000.93829", "2226522@163.com"));
        asserts.add(new Assert("CYB", "0000000023", "100000.93829", "22456222@163.com"));
        asserts.add(new Assert("VET", "0000000023", "100000.93829", "2562222@163.com"));
        asserts.add(new Assert("EOS", "00006000023", "100000.93829", "22456222@163.com"));
        asserts.add(new Assert("VEN", "0000000023", "100000.93829", "2225622@163.com"));
        asserts.add(new Assert("XTZ", "0000000023", "100000.93829", "2225622@163.com"));
        return asserts;
    }

    public static List<Settlement> settlementList() {
        ArrayList<Settlement> settlements = new ArrayList<>();
        settlements.add(new Settlement().setFee("9.23").setCoinName("BTC").setTradingDate("2020-01-01 00:00:00").setBlockChainFee("9.23").setFeeCoinName("BTC").setAmount("8293823.82389").setDirection("1").setId("27332323456423").setClientId("0000000021").setRegisteredName("dekkfks@163.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("2.012212").setCoinName("ETH").setTradingDate("2020-01-02 00:00:00").setBlockChainFee("43.23923").setFeeCoinName("ETH").setAmount("2323.1").setDirection("1").setId("92832734842").setClientId("0000000021").setRegisteredName("dekeeeeee@163.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("9239.2000023").setCoinName("USDT").setTradingDate("2020-01-03 00:00:00").setBlockChainFee("239.2").setFeeCoinName("USDT").setAmount("928239.8123819").setDirection("1").setId("19484343728334").setClientId("0000000021").setRegisteredName("qqqqqs@163.com").setBlockChainFeeType("2"));
        settlements.add(new Settlement().setFee("19.223").setCoinName("BTC").setTradingDate("2020-01-03 00:00:00").setBlockChainFee("93.232").setFeeCoinName("BTC").setAmount("443434.33").setDirection("0").setId("6534768029923").setClientId("0000000021").setRegisteredName("deeeeee@163.com").setBlockChainFeeType("3"));
        settlements.add(new Settlement().setFee("122.0122212").setCoinName("ETH").setTradingDate("2020-01-04 00:00:00").setBlockChainFee("423.239323").setFeeCoinName("ETH").setAmount("34321.1").setDirection("0").setId("191282132734").setClientId("0000000021").setRegisteredName("12212267@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("42.20200023").setCoinName("USDT").setTradingDate("2020-02-03 00:00:00").setBlockChainFee("2839.2").setFeeCoinName("USDT").setAmount("1212.34").setDirection("0").setId("634343434").setClientId("0000000021").setRegisteredName("1111567@qq.com").setBlockChainFeeType("2"));
        settlements.add(new Settlement().setFee("33.2").setCoinName("BTC").setTradingDate("2020-02-07 00:00:00").setBlockChainFee("29.23434").setFeeCoinName("BTC").setAmount("98751.34").setDirection("1").setId("119298987912").setClientId("0000000022").setRegisteredName("123334567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("EOS").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.4").setFeeCoinName("EOS").setAmount("1343439776.34").setDirection("0").setId("81192989879").setClientId("0000000022").setRegisteredName("1234567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("USDT(ERC20)").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.4").setFeeCoinName("USDT(ERC20)").setAmount("1343439776.34").setDirection("0").setId("81192989879").setClientId("0000000022").setRegisteredName("1234567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("XTZ").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.4").setFeeCoinName("XTZ").setAmount("1343439776.34").setDirection("0").setId("81192989879").setClientId("0000000022").setRegisteredName("1234567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("USDT(Omni)").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.4").setFeeCoinName("USDT(Omni)").setAmount("1343439776.34").setDirection("0").setId("81192989879").setClientId("0000000022").setRegisteredName("1234567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("BTC").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("BTC").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("BCH").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("BCH").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("BSV").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("BSV").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("ETH").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("ETH").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("Airbnb").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("Airbnb").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("LTC").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("LTC").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("DOGE").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("DOGE").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("DASH").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("DASH").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("XRP").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("XRP").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("XLM").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("XLM").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("XMR").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("XMR").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("ADA").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("ADA").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("ZCASH").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("ZCASH").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("mixin").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("mixin").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("groestlcoin").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("groestlcoin").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("USDC").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("USDC").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("USDT(ERC20)").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("USDT(ERC20)").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("ZRX").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("ZRX").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("GNT").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("GNT").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("AYB").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("AYB").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("XXB").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("XXB").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("HBB").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("HBB").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("QTUM").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("QTUM").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("ATOM").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("ATOM").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("STX").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("STX").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("USDT").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("USDT").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("LX").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("LX").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("YLL").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("YLL").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("CYB").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("CYB").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("VET").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("VET").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("EOS").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("EOS").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("VEN").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("VEN").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("XTZ").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("XTZ").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        settlements.add(new Settlement().setFee("23.452").setCoinName("USDT(Omni)").setTradingDate("2020-02-06 00:00:00").setBlockChainFee("1.41").setFeeCoinName("USDT(Omni)").setAmount("13434319776.34").setDirection("0").setId("811929189879").setClientId("0000000022").setRegisteredName("12342567@qq.com").setBlockChainFeeType("1"));
        return settlements;
    }


    public static List<Trade> tradeList() {
        ArrayList<Trade> trades = new ArrayList<>();
        trades.add(new Trade().setAmount("29392.121221").setClientId("0000000021").setCoinName("BTC").setDirection("1").setFee("9.827338").setId("92382329238").setTradingDate("2020-01-01 00:00:00").setRegisteredName("2ds223@163.com"));
        trades.add(new Trade().setAmount("23.2").setClientId("0000000021").setCoinName("ETH").setDirection("1").setFee("923.283392").setId("72837283273").setTradingDate("2020-01-01 01:00:00").setRegisteredName("222ss3@163.com"));
        trades.add(new Trade().setAmount("938.1921831").setClientId("0000000021").setCoinName("CYB").setDirection("1").setFee("19.1").setId("322232123421").setTradingDate("2020-01-02 00:00:00").setRegisteredName("2gddd223@163.com"));
        trades.add(new Trade().setAmount("923.983121221").setClientId("0000000021").setCoinName("EOS").setDirection("1").setFee("100").setId("93837287372").setTradingDate("2020-01-03 00:00:00").setRegisteredName("dddfd2223@163.com"));
        trades.add(new Trade().setAmount("1293922.121221").setClientId("0000000021").setCoinName("BTC").setDirection("0").setFee("19.827338").setId("92382329238").setTradingDate("2020-01-01 12:00:00").setRegisteredName("ffff2223@163.com"));
        trades.add(new Trade().setAmount("21123.2").setClientId("0000000021").setCoinName("ETH").setDirection("0").setFee("423.283392").setId("72837283273").setTradingDate("2020-01-01 11:00:00").setRegisteredName("ddd2223@163.com"));
        trades.add(new Trade().setAmount("232").setClientId("0000000022").setCoinName("BTC").setDirection("1").setFee("1").setId("938279318").setTradingDate("2020-01-04 00:00:00").setRegisteredName("sss23@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("BTC").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("222ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("USDT(ERC20)").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("222ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("XTZ").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("222ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("USDT(Omni)").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("222ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("BTC").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("BCH").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("BSV").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("ETH").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("Airbnb").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("LTC").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("DOGE").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("DASH").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("XRP").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("XLM").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("XMR").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("ADA").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("ZCASH").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("mixin").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("groestlcoin").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("USDC").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("USDT(ERC20)").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("ZRX").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("GNT").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("AYB").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("XXB").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("HBB").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("QTUM").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("ATOM").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("STX").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("USDT").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("LX").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("YLL").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("CYB").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("VET").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("EOS").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("VEN").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("XTZ").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        trades.add(new Trade().setAmount("222.022").setClientId("0000000022").setCoinName("USDT(Omni)").setDirection("0").setFee("1.9").setId("827328328323").setTradingDate("2020-01-05 00:00:00").setRegisteredName("22ds2ddd3@163.com"));
        return trades;
    }

    public static List<Activity> activityList() {
        ArrayList<Activity> activities = new ArrayList<>();
        activities.add(new Activity().setCoinName("BTC").setTradingDate("2020-01-01 11:00:00").setAmount("8232.23").setClientId("0000000021").setDirection("1").setId("932838293923").setRegisteredName("4444@qq.com"));
        activities.add(new Activity().setCoinName("ETH").setTradingDate("2020-01-02 11:00:00").setAmount("34232322.23").setClientId("0000000021").setDirection("0").setId("9286438293923").setRegisteredName("63443@163.com"));
        activities.add(new Activity().setCoinName("EOS").setTradingDate("2020-01-01 11:00:00").setAmount("6454.2333").setClientId("0000000022").setDirection("1").setId("92823829343923").setRegisteredName("134@qq.com"));
        activities.add(new Activity().setCoinName("USDT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("USDT(ERC20)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("XTZ").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("USDT(Omni)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("BTC").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("BCH").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("BSV").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("ETH").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("Airbnb").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("LTC").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("DOGE").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("DASH").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("XRP").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("XLM").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("XMR").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("ADA").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("ZCASH").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("mixin").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("groestlcoin").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("USDC").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("USDT(ERC20)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("ZRX").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("GNT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("AYB").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("XXB").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("HBB").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("QTUM").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("ATOM").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("STX").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("USDT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("LX").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("YLL").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("CYB").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("VET").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("EOS").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("VEN").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("XTZ").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        activities.add(new Activity().setCoinName("USDT(Omni)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setDirection("0").setId("928234382693923").setRegisteredName("4ffffds@163.com"));
        return activities;
    }


    public static List<CompanyInput> companyInputList() {
        ArrayList<CompanyInput> companyInputs = new ArrayList<>();
        companyInputs.add(new CompanyInput().setCoinName("BTC").setTradingDate("2020-01-01 11:00:00").setAmount("8232.23").setClientId("0000000021").setId("932838293923"));
        companyInputs.add(new CompanyInput().setCoinName("ETH").setTradingDate("2020-01-02 11:00:00").setAmount("34232322.23").setClientId("0000000021").setId("9286438293923"));
        companyInputs.add(new CompanyInput().setCoinName("EOS").setTradingDate("2020-01-01 11:00:00").setAmount("6454.2333").setClientId("0000000022").setId("92823829343923"));
        companyInputs.add(new CompanyInput().setCoinName("USDT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("USDT(ERC20)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("XTZ").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("USDT(Omni)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("BTC").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("BCH").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("BSV").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("ETH").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("Airbnb").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("LTC").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("DOGE").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("DASH").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("XRP").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("XLM").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("XMR").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("ADA").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("ZCASH").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("mixin").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("groestlcoin").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("USDC").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("USDT(ERC20)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("ZRX").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("GNT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("AYB").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("XXB").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("HBB").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("QTUM").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("ATOM").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("STX").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("USDT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("LX").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("YLL").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("CYB").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("VET").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("EOS").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("VEN").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("XTZ").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        companyInputs.add(new CompanyInput().setCoinName("USDT(Omni)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setClientId("0000000022").setId("928234382693923"));
        return companyInputs;
    }

    public static List<AbnormalTurnedhot> abnormalTurnedhotList() {
        ArrayList<AbnormalTurnedhot> abnormalTurnedhots = new ArrayList<>();
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("BTC").setTradingDate("2020-01-01 11:00:00").setAmount("8232.23").setId("932838293923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("ETH").setTradingDate("2020-01-02 11:00:00").setAmount("34232322.23").setId("9286438293923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("EOS").setTradingDate("2020-01-01 11:00:00").setAmount("6454.2333").setId("92823829343923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("USDT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("USDT(ERC20)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("XTZ").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("USDT(Omni)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("BTC").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("BCH").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("BSV").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("ETH").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("Airbnb").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("LTC").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("DOGE").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("DASH").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("XRP").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("XLM").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("XMR").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("ADA").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("ZCASH").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("mixin").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("groestlcoin").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("USDC").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("USDT(ERC20)").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("ZRX").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("GNT").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("AYB").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("XXB").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("HBB").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("QTUM").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("ATOM").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("STX").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("USDT").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("LX").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("YLL").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("CYB").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("VET").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("EOS").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("VEN").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("XTZ").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        abnormalTurnedhots.add(new AbnormalTurnedhot().setCoinName("USDT(Omni)").setTradingDate("2020-01-02 12:00:00").setAmount("442233.34263").setId("928234382693923"));
        return abnormalTurnedhots;
    }

    public static List<BlockchainFee> blockchainFeeList() {
        ArrayList<BlockchainFee> blockchainFees = new ArrayList<>();
        blockchainFees.add(new BlockchainFee().setCoinName("BTC").setTradingDate("2020-01-01 11:00:00").setAmount("8232.23").setId("932838293923").setType("1"));
        blockchainFees.add(new BlockchainFee().setCoinName("ETH").setTradingDate("2020-01-02 11:00:00").setAmount("34232322.23").setId("9286438293923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("EOS").setTradingDate("2020-01-01 11:00:00").setAmount("6454.2333").setId("92823829343923").setType("1"));
        blockchainFees.add(new BlockchainFee().setCoinName("USDT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("USDT(ERC20)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("XTZ").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("USDT(Omni)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("BTC").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("BCH").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("BSV").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("ETH").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("Airbnb").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("LTC").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("DOGE").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("DASH").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("XRP").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("XLM").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("XMR").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("ADA").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("ZCASH").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("mixin").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("groestlcoin").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("USDC").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("USDT(ERC20)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("ZRX").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("GNT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("AYB").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("XXB").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("HBB").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("QTUM").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("ATOM").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("STX").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("USDT").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("LX").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("YLL").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("CYB").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("VET").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("EOS").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("VEN").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("XTZ").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        blockchainFees.add(new BlockchainFee().setCoinName("USDT(Omni)").setTradingDate("2020-01-02 11:00:00").setAmount("44233.34263").setId("928234382693923").setType("0"));
        return blockchainFees;
    }

    public static List<MinerFee> minerFeeList() {
        ArrayList<MinerFee> minerFees = new ArrayList<>();
        minerFees.add(new MinerFee("BTC", "0.0001", "0.0001", "152"));
        minerFees.add(new MinerFee("VTHO", "0.0001", "0.0001", "153"));
        minerFees.add(new MinerFee("BTC", "0.0002", "0.0002", "124"));
        minerFees.add(new MinerFee("BTC", "0.0001", "0.0001", "155"));
        minerFees.add(new MinerFee("CYB", "0.0003", "0.0003", "156"));
        minerFees.add(new MinerFee("BTC", "0.0001", "0.0001", "147"));
        minerFees.add(new MinerFee("ETC", "0.0004", "0.0004", "158"));
        minerFees.add(new MinerFee("ETC", "0.0001", "0.0001", "175"));
        minerFees.add(new MinerFee("USDT(ERC20)", "0.0001", "0.0001", "175"));
        minerFees.add(new MinerFee("XTZ", "0.0001", "0.0001", "175"));
        minerFees.add(new MinerFee("USDT(Omni)", "0.0001", "0.0001", "175"));
        minerFees.add(new MinerFee("BTC", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("BCH", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("BSV", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("ETH", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("Airbnb", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("LTC", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("DOGE", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("DASH", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("XRP", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("XLM", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("XMR", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("ADA", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("ZCASH", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("mixin", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("groestlcoin", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("USDC", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("USDT(ERC20)", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("ZRX", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("GNT", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("AYB", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("XXB", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("HBB", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("QTUM", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("ATOM", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("STX", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("USDT", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("LX", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("YLL", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("CYB", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("VET", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("EOS", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("VEN", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("XTZ", "0.00201", "0.00201", "185"));
        minerFees.add(new MinerFee("USDT(Omni)", "0.00201", "0.00201", "185"));
        return minerFees;
    }

    public static List<RechargeUnexpected> rechargeUnexpectedList() {
        ArrayList<RechargeUnexpected> rechargeUnexpectedList = new ArrayList<>();
        rechargeUnexpectedList.add(new RechargeUnexpected("VET", "5224.5467", "1123"));
        rechargeUnexpectedList.add(new RechargeUnexpected("BTC", "2.5467", "1223"));
        rechargeUnexpectedList.add(new RechargeUnexpected("VET", "42133.5467", "1723"));
        rechargeUnexpectedList.add(new RechargeUnexpected("USDT", "1.5467", "1523"));
        rechargeUnexpectedList.add(new RechargeUnexpected("VET", "42133.5467", "1233"));
        rechargeUnexpectedList.add(new RechargeUnexpected("LTC", "896.5467", "2163"));
        rechargeUnexpectedList.add(new RechargeUnexpected("USDT(ERC20)", "896.5467", "2163"));
        rechargeUnexpectedList.add(new RechargeUnexpected("XTZ", "896.5467", "2163"));
        rechargeUnexpectedList.add(new RechargeUnexpected("USDT(Omni)", "896.5467", "2163"));
        rechargeUnexpectedList.add(new RechargeUnexpected("BTC", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("BCH", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("BSV", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("ETH", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("Airbnb", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("LTC", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("DOGE", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("DASH", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("XRP", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("XLM", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("XMR", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("ADA", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("ZCASH", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("mixin", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("groestlcoin", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("USDC", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("USDT(ERC20)", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("ZRX", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("GNT", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("AYB", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("XXB", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("HBB", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("QTUM", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("ATOM", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("STX", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("USDT", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("LX", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("YLL", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("CYB", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("VET", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("EOS", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("VEN", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("XTZ", "896.54367", "21623"));
        rechargeUnexpectedList.add(new RechargeUnexpected("USDT(Omni)", "896.54367", "21623"));
        return rechargeUnexpectedList;
    }

    public static List<Currency> currencyList() {
        ArrayList<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Currency("BTC", "BTC"));
        currencyList.add(new Currency("BCH", "BCH"));
        currencyList.add(new Currency("BSV", "BSV"));
        currencyList.add(new Currency("ETH", "ETH"));
        currencyList.add(new Currency("Airbnb", "Airbnb"));
        currencyList.add(new Currency("LTC", "LTC"));
        currencyList.add(new Currency("DOGE", "DOGE"));
        currencyList.add(new Currency("DASH", "DASH"));
        currencyList.add(new Currency("XRP", "XRP"));
        currencyList.add(new Currency("XLM", "XLM"));
        currencyList.add(new Currency("XMR", "XMR"));
        currencyList.add(new Currency("ADA", "VET"));
        currencyList.add(new Currency("ZCASH", "ZCASH"));
        currencyList.add(new Currency("mixin", "mixin"));
        currencyList.add(new Currency("groestlcoin", "groestlcoin"));
        currencyList.add(new Currency("USDC", "USDC"));
        currencyList.add(new Currency("USDT(ERC20)", "USDT(ERC20)"));
        currencyList.add(new Currency("ZRX", "ZRX"));
        currencyList.add(new Currency("GNT", "GNT"));
        currencyList.add(new Currency("AYB", "AYB"));
        currencyList.add(new Currency("XXB", "XXB"));
        currencyList.add(new Currency("HBB", "HBB"));
        currencyList.add(new Currency("QTUM", "QTUM"));
        currencyList.add(new Currency("ATOM", "ATOM"));
        currencyList.add(new Currency("STX", "STX"));
        currencyList.add(new Currency("USDT", "USDT"));
        currencyList.add(new Currency("LX", "LX"));
        currencyList.add(new Currency("YLL", "YLL"));
        currencyList.add(new Currency("CYB", "CYB"));
        currencyList.add(new Currency("VET", "VET"));
        currencyList.add(new Currency("EOS", "EOS"));
        currencyList.add(new Currency("VEN", "VEN"));
        currencyList.add(new Currency("XTZ", "XTZ"));
        currencyList.add(new Currency("USDT(Omni)", "USDT(Omni)"));
        return currencyList;
    }

    public static List<WalletBalance> balanceList() {
        List<WalletBalance> balanceList = new ArrayList<>();
        balanceList.add(new WalletBalance("BTC", "132","2020-07-22"));
        balanceList.add(new WalletBalance("BCH", "123","2020-07-22"));
        balanceList.add(new WalletBalance("BSV", "44","2020-07-22"));
        balanceList.add(new WalletBalance("ETH", "123","2020-07-22"));
        balanceList.add(new WalletBalance("Airbnb", "31","2020-07-22"));
        balanceList.add(new WalletBalance("LTC", "54","2020-07-22"));
        balanceList.add(new WalletBalance("DOGE", "3.434","2020-07-22"));
        balanceList.add(new WalletBalance("DASH", "45.3232","2020-07-22"));
        balanceList.add(new WalletBalance("XRP", "43243","2020-07-22"));
        balanceList.add(new WalletBalance("XLM", "567","2020-07-22"));
        balanceList.add(new WalletBalance("XMR", "6575","2020-07-22"));
        balanceList.add(new WalletBalance("ADA", "456","2020-07-22"));
        balanceList.add(new WalletBalance("ZCASH", "456","2020-07-22"));
        balanceList.add(new WalletBalance("mixin", "456","2020-07-22"));
        balanceList.add(new WalletBalance("groestlcoin", "567","2020-07-22"));
        balanceList.add(new WalletBalance("USDC", "567","2020-07-22"));
        balanceList.add(new WalletBalance("USDT(ERC20)", "567","2020-07-22"));
        balanceList.add(new WalletBalance("ZRX", "756","2020-07-22"));
        balanceList.add(new WalletBalance("GNT", "576","2020-07-22"));
        balanceList.add(new WalletBalance("AYB", "567","2020-07-22"));
        balanceList.add(new WalletBalance("XXB", "5765","2020-07-22"));
        balanceList.add(new WalletBalance("HBB", "34","2020-07-22"));
        balanceList.add(new WalletBalance("QTUM", "5675","2020-07-22"));
        balanceList.add(new WalletBalance("ATOM", "5675","2020-07-22"));
        balanceList.add(new WalletBalance("STX", "8","2020-07-22"));
        balanceList.add(new WalletBalance("USDT", "23","2020-07-22"));
        balanceList.add(new WalletBalance("LX", "5","2020-07-22"));
        balanceList.add(new WalletBalance("YLL", "6","2020-07-22"));
        balanceList.add(new WalletBalance("CYB", "4","2020-07-22"));
        balanceList.add(new WalletBalance("VET", "3456","2020-07-22"));
        balanceList.add(new WalletBalance("EOS", "4","2020-07-22"));
        balanceList.add(new WalletBalance("VEN", "4","2020-07-22"));
        balanceList.add(new WalletBalance("XTZ", "43563","2020-07-22"));
        return balanceList;
    }

}



