import jj.externalSorting.service.CustomerService;
import jj.externalSorting.service.CustomerServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        /* remove hardcoded reference for CSImpl: CustomerService service = new CustomerServiceImplementation();*/
        /* our application can now be changed without needing to change anything in the implementation of customer service */
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = appContext.getBean("beanCustomerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstName()
        + " " +service.findAll().get(0).getLastName() + " using setter injection");
    }
    /* wherever we see an interface being specifically implemented,
    we should try and abstract that out of our code, and not have things hard coded */
}
