package eci.cosw.data;


import eci.cosw.data.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepository extends MongoRepository<Todo,String> {

    //To do findByDescription(String description);

    //List<To do> findByPriority(String priority);

    //List<To do> findByDate(String dueDate);

    List<Todo> findByResponsible(String responsible);

    //List<To do> findByStatus(String status);



}
