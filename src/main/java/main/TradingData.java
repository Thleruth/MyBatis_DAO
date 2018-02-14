package main;

/**
 * Created by Thomas Leruth on 2/14/18
 */

public class TradingData {

    int tradeID;
    String exchangeBuy;
    String exchangeSell;
    double askPrice;
    double bidPrice;

    public int getTradeID() {
        return tradeID;
    }

    public void setTradeID(int tradeID) {
        this.tradeID = tradeID;
    }

    public String getExchangeBuy() {
        return exchangeBuy;
    }

    public void setExchangeBuy(String exchangeBuy) {
        this.exchangeBuy = exchangeBuy;
    }

    public String getExchangeSell() {
        return exchangeSell;
    }

    public void setExchangeSell(String exchangeSell) {
        this.exchangeSell = exchangeSell;
    }

    public double getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(double askPrice) {
        this.askPrice = askPrice;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }
}
