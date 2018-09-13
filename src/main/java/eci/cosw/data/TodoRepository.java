package eci.cosw.data;


import eci.cosw.data.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepository extends MongoRepository<Todo, String> {

    Todo findByDescription(String description);

    List<Todo> findByPriority(Integer priority);

    List<Todo> findByDate(String date);

    List<Todo> findByResponsible(String responsible);

    List<Todo> findByStatus(String status);




}
