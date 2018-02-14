package main;

import org.apache.ibatis.session.SqlSession;

/**
 * Created by Thomas Leruth on 2/14/18
 */

public class DataDAO {

    public void save(TradingData tradingData){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        DataMapper mapper = session.getMapper(DataMapper.class);
        mapper.insertData(tradingData);
        session.commit();
        session.close();
    }

}
