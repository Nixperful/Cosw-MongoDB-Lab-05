package eci.cosw;

import eci.cosw.data.CustomerRepository;
import eci.cosw.data.TodoRepository;
import eci.cosw.data.UserRepository;
import eci.cosw.data.config.AppConfiguration;
import eci.cosw.data.model.Customer;
import eci.cosw.data.model.Todo;
import eci.cosw.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

@SpringBootApplication
public class Application implements CommandLineRunner {


    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TodoRepository todoRepository;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");


        customerRepository.deleteAll();

        customerRepository.save(new Customer("Alice", "Smith"));
        customerRepository.save(new Customer("Bob", "Marley"));
        customerRepository.save(new Customer("Jimmy", "Page"));
        customerRepository.save(new Customer("Freddy", "Mercury"));
        customerRepository.save(new Customer("Michael", "Jackson"));

        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : customerRepository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        userRepository.save(new User("Nicolas" , "nicolas@test.com" ));
        todoRepository.save(new Todo("COSW lab", "1", "Sep 18 - 2018", "nicolas@test.com", "En Proceso" ));
        todoRepository.save(new Todo("Read Stadistic Book", "2", "Sep 19 - 2018", "nicolas@test.com", "Pag 14" ));
        todoRepository.save(new Todo("COSW proyect", "1", "Oct 02 - 2018", "nicolas@test.com", "En Proceso" ));

        userRepository.save(new User("Joao" , "joao@test.com" ));
        todoRepository.save(new Todo("Travel to Irland", "3", "Sep 21 - 2019", "joao@test.com", "I have Tickets" ));
        todoRepository.save(new Todo("Cook turkey", "2", "Nov 19 - 2018", "joao@test.com", "I buy the Turkey" ));
        todoRepository.save(new Todo("COSW proyect", "1", "Oct 22 - 2018", "joao@test.com", "Begining" ));

        userRepository.save(new User("Adriana" , "adriana@test.com" ));
        todoRepository.save(new Todo("Friday Party", "3", "Sep 21 - 2018", "adriana@test.com", "I have the clothes" ));
        todoRepository.save(new Todo("Go to Bucaramanga", "2", "Nov 30 - 2018", "adriana@test.com", "Nothing" ));
        todoRepository.save(new Todo("Office Work", "1", "Jul 22 - 2018", "adriana@test.com", "Completed" ));

        userRepository.save(new User("Pedro" , "pedro@test.com" ));
        todoRepository.save(new Todo("wash the workshop", "1", "Sep 29 - 2018", "pedro@test.com", "Incompleted" ));
        todoRepository.save(new Todo("fix the swing", "2", "Sep 30 - 2018", "pedro@test.com", "Fixed" ));

        userRepository.save(new User("Luis" , "luis@test.com" ));
        todoRepository.save(new Todo("laundry", "2", "Sep 10 - 2018", "pedro@test.com", "Completed" ));
        todoRepository.save(new Todo("Call Mom", "1", "Dec 31 - 2018", "pedro@test.com", "No Cellphone" ));

        userRepository.save(new User("David" , "david@test.com" ));
        todoRepository.save(new Todo("Paying Taxes", "1", "Jul 21 - 2018", "david@test.com", "Completed" ));
        todoRepository.save(new Todo("Wash Car", "3", "May 30 - 2018", "david@test.com", "Completed" ));

        userRepository.save(new User("Nicolas" , "nicolas@test.com" ));
        todoRepository.save(new Todo("Paying Taxes", "1", "Jul 21 - 2018", "david@test.com", "Completed" ));
        todoRepository.save(new Todo("Wash Car", "3", "May 30 - 2018", "david@test.com", "Completed" ));

        userRepository.save(new User("Nicolas" , "nicolas@test.com" ));
        todoRepository.save(new Todo("Paying Taxes", "1", "Jul 21 - 2018", "david@test.com", "Completed" ));
        todoRepository.save(new Todo("Wash Car", "3", "May 30 - 2018", "david@test.com", "Completed" ));

        userRepository.save(new User("Nicolas" , "nicolas@test.com" ));
        todoRepository.save(new Todo("Wash Car", "3", "May 30 - 2018", "david@test.com", "Completed" ));
        todoRepository.save(new Todo("Wash Car", "3", "May 30 - 2018", "david@test.com", "Completed" ));

        userRepository.save(new User("Nicolas" , "nicolas@test.com" ));
        todoRepository.save(new Todo("Paying Taxes", "1", "Jul 21 - 2018", "david@test.com", "Completed" ));
        todoRepository.save(new Todo("Wash Car", "3", "May 30 - 2018", "david@test.com", "Completed" ));
        todoRepository.save(new Todo("Paying Taxes", "1", "Jul 21 - 2018", "david@test.com", "Completed" ));
        
    }

}