package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StockAgentTest {


    @Test

    public void theObserverIsCreatedAndAddToList (){
        StockAgent agent = new StockAgent();
        Observer alphaBrokers = new Observer("Alpha Brokers");

        agent.addObserver(alphaBrokers);

        assertEquals(1,agent.getListObservers().size());
    }

    @Test
    public void TheAgentmetod_Notificate_marketUPtoObserver(){
        StockAgent agent = new StockAgent();
        Observer alphaBrokers = new Observer("Alpha Brokers");

        agent.addObserver(alphaBrokers);
        agent.stockMarketUp(250);
        assertEquals(alphaBrokers.getNotification(),250);

    }

    @Test
    public void TheAgentmetod_Notificate_marketDOWNtoObserver(){
        StockAgent agent = new StockAgent();
        Observer alphaBrokers = new Observer("Alpha Brokers");

        agent.addObserver(alphaBrokers);
        agent.stockMarketDown(49);
        assertEquals(alphaBrokers.getNotification(),49);

    }






    /*@Test
    public void testStockAgentNotifications() {
        StockAgent agent = new StockAgent();

        Observer alphaBrokers = new Observer("Alpha Brokers");
        Observer zenithInvestments = new Observer ("Zenith Investments");

        agent.addObserver(alphaBrokers);
        agent.addObserver(zenithInvestments);

        agent.stockMarketUp(150.75);
        // Expected console output:
        // Alpha Brokers received notification: Stock market went UP to 150.75
        // Zenith Investments received notification: Stock market went UP to 150.75

        agent.stockMarketDown(145.50);
        // Expected console output:
        // Alpha Brokers received notification: Stock market went DOWN to 145.50
        // Zenith Investments received notification: Stock market went DOWN to 145.50
    }
*/
}
