public class FoodFactoryNps implements AbstractFactory{
    @Override
    public Company companyName() {
        return new FoodCompany();
    }

    @Override
    public Satisfaction satisfactionType() {
        return new Nps() ;
    }
}
