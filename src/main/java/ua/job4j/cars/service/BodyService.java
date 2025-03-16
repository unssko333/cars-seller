package ua.job4j.cars.service;

import org.springframework.stereotype.Service;
import ua.job4j.cars.repository.BodyRepository;
import ua.job4j.cars.model.Body;

import java.util.List;

@Service
public class BodyService {

    private final BodyRepository store;

    public BodyService(BodyRepository store) {
        this.store = store;
    }

    public List<Body> findAll() {
        return store.findAll();
    }
}
