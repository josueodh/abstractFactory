import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @Test
    void itShouldBeFoodCompany(){
        AbstractFactory factory = new FoodFactoryNps();
        Client client = new Client(factory);
        assertEquals("Food Company", client.printCompany());
    }

    @Test
    void itShouldBeNps(){
        AbstractFactory factory = new FoodFactoryNps();
        Client client = new Client(factory);
        assertEquals("Nps", client.printSatisfaction());
    }

    @Test
    void itShouldBeHealth(){
        AbstractFactory factory = new HealthFactoryCsat();
        Client client = new Client(factory);
        assertEquals("Health Company", client.printCompany());
    }

    @Test
    void itShouldBeCsat(){
        AbstractFactory factory = new HealthFactoryCsat();
        Client client = new Client(factory);
        assertEquals("Csat", client.printSatisfaction());
    }
}