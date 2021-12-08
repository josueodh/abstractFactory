public class HealthFactoryCsat implements AbstractFactory{
    @Override
    public Company companyName() {
        return new HealthCompany();
    }

    @Override
    public Satisfaction satisfactionType() {
        return new Csat();
    }
}
