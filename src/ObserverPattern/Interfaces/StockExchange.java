package ObserverPattern.Interfaces;

public interface StockExchange {
    void registerForNotification(Observer observer);
    void buyStocksFor(String company, int stockQuantity);
}
