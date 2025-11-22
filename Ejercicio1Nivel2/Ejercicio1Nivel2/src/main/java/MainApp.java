import model.Observer;
import model.StockAgent;

public class MainApp {
    public static void main(String[] args) {


        StockAgent agent = new StockAgent();

        Observer  brokersParis = new Observer("Brokers-Paris");
        Observer brokersEspaña = new Observer("Brokers-España");

        agent.addObserver(brokersEspaña);
        agent.addObserver(brokersParis);

        agent.stockMarketUp(150.75);

        agent.stockMarketDown(145.50);

        System.out.println(brokersEspaña.getNotification());



    }

}
