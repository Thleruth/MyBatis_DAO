package main;

import org.apache.ibatis.annotations.Insert;

/**
 * Created by Thomas Leruth on 2/14/18
 */

public interface DataMapper {

    String INSERT_TRADINGDATA = "INSERT INTO `testTrading`.tradingTable (TradeID, exchangeBuy, exchangeSell, askPrice, BidPrice) " +
            "VALUES (#{tradeID}, #{exchangeBuy}, #{exchangeSell}, #{askPrice}, #{bidPrice})";

    @Insert(INSERT_TRADINGDATA)
    int insertData (TradingData tradingData);
}
