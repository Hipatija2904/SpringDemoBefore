import jj.externalSorting.service.CustomerService;
import jj.externalSorting.service.CustomerServiceImplementation;

public class Application {
    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImplementation();
        //this is going to be removed by spring to eliminate being hard coded
        System.out.println(service.findAll().get(0).getFirstName()
        + " " +service.findAll().get(0).getLastName());
    }
    /* wherever we see an interface being specifically implemented, we should try and abstract that out of our code, and not have things hard coded */
}
