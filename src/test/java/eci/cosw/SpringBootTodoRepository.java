package eci.cosw;


import eci.cosw.data.TodoRepository;
import eci.cosw.data.model.Todo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTodoRepository {

    /*@Autowired
    private TodoRepository todoRepository;*/


    @Test
    public void contextLoads() {
       // SpringApplication.run(SpringBootTodoRepository.class);
    }


    @Test
    public void todoRepositoryFindByResponsible(){
        /*todoRepository.deleteAll();

        todoRepository.save(new Todo("COSW lab", 2, new Date().toString(), "nicolas@test.com", "En Proceso" ));
        todoRepository.save(new Todo("Laundry", 4, new Date().toString(), "prueba@test.com", "En espera" ));
        todoRepository.save(new Todo("Read Book 2", 3, new Date().toString(), "nicolas@test.com", "Pagina 50/150" ));
        todoRepository.save(new Todo("Watering Plants", 5, new Date().toString(), "prueba@test.com", "Sin iniciar" ));
        todoRepository.save(new Todo("Work on the project", 1, new Date().toString(), "nicolas@test.com", "Primer Avance Completo" ));

        System.out.println("Todós found with findAll():");
        System.out.println("-------------------------------");
        for (Todo todo : todoRepository.findAll()) {
            System.out.println(todo);
        }
        System.out.println();*/


    }


}




