package ua.job4j.cars.repository;

import org.springframework.stereotype.Repository;
import ua.job4j.cars.model.Body;
import ua.job4j.cars.util.CrudRepository;

import java.util.List;

@Repository
public class BodyRepository {
    private final CrudRepository crudRepository;

    public BodyRepository(CrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Body> findAll() {
        return  crudRepository.query("FROM Body", Body.class);
    }
}
