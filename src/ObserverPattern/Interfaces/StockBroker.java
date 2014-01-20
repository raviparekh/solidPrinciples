package ObserverPattern.Interfaces;

/**
 * Created by ravi on 07/10/2015.
 */
public interface StockBroker extends Observer {
    void buySharesFor(String company, int sharesQuantity);
}
