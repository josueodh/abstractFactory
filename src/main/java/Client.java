public class Client {
    private Company company;
    private Satisfaction satisfaction;


    public Client(AbstractFactory factory){
        this.company = factory.companyName();
        this.satisfaction = factory.satisfactionType();
    }

    public String printCompany(){
        return this.company.print();
    }

    public String printSatisfaction(){
        return this.satisfaction.print();
    }
}
