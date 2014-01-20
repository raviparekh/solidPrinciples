package ObserverPattern;

import ObserverPattern.Interfaces.StockBroker;
import ObserverPattern.Interfaces.StockExchange;
import ObserverPattern.Observers.StockBrokerA;
import ObserverPattern.Observers.StockBrokerB;
import ObserverPattern.StockExchanges.FSE100;


public class Main {
    public static void main(String[] args) {
        StockExchange fse100 = new FSE100();
        StockBroker stockBrokerA = new StockBrokerA(fse100);
        StockBroker stockBrokerB = new StockBrokerB(fse100);

        stockBrokerA.buySharesFor("Google", 1000);
        stockBrokerB.buySharesFor("Microsoft", 1000);

    }
}
