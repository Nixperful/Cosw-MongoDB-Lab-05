package eci.cosw;


import eci.cosw.data.TodoRepository;
import eci.cosw.data.model.Todo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTodoRepository {

    @Autowired
    private TodoRepository todoRepository;

    @Before
    public void init() {
        todoRepository.deleteAll();
        todoRepository.save(new Todo("COSW lab", "2", "Sep 27 - 2018", "nicolas@test.com", "En Proceso" ));
        todoRepository.save(new Todo("Laundry", "4", "Oct 01 - 2018", "prueba@test.com", "En espera" ));
        todoRepository.save(new Todo("Read Book 2", "3", "Oct 07 - 2018", "nicolas@test.com", "Pagina 50/150" ));
        todoRepository.save(new Todo("Watering Plants", "5", "Nov 11 - 2018", "prueba@test.com", "Sin iniciar" ));
        todoRepository.save(new Todo("Work on the project", "1", "Nov 17 - 2018", "nicolas@test.com", "Primer Avance Completo" ));
    }


    @Test
    public void todoRepositoryFindByResponsible(){
        List<Todo> firstResult = todoRepository.findByResponsible("prueba@test.com");
        assertEquals(2, firstResult.size());
        List<Todo> secondResult = todoRepository.findByResponsible("nicolas@test.com");
        assertEquals(3, secondResult.size());
        assertEquals( firstResult.size()+1 ,secondResult.size());
    }

}




