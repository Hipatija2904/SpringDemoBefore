import jj.externalSorting.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = appContext.getBean("beanCustomerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstName()
        + " " +service.findAll().get(0).getLastName() + " using autowired by name");
    }

}
