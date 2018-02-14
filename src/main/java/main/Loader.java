package main;


/**
 * Created by Thomas Leruth on 2/14/18
 */

public class Loader {

    DataMapper dataMapper;

    public static void main(String[] args) {

        DataDAO dataDao = new DataDAO();

        TradingData a = new TradingData();
        a.setTradeID(1);
        a.setExchangeBuy("Kraken");
        a.setExchangeSell("Gdax");

        dataDao.save(a);
    }

}
