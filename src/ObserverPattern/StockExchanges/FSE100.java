package ObserverPattern.StockExchanges;

import ObserverPattern.Interfaces.Observer;
import ObserverPattern.Interfaces.StockExchange;

import java.util.ArrayList;
import java.util.List;

public class FSE100 implements StockExchange {
    List<Observer> stockBrokers = new ArrayList<>();

    @Override
    public void registerForNotification(Observer observer){
        stockBrokers.add(observer);
    }

    @Override
    public void buyStocksFor(String company, int stockQuantity) {
        System.out.println(stockQuantity + " stocks purchased in company " + company);
        notifyObservers();
    }

    private void notifyObservers(){
        for(Observer observer : stockBrokers){
            observer.update();
        }
    }


}
