package ua.job4j.cars.service;

import org.springframework.stereotype.Service;
import ua.job4j.cars.repository.EngineRepository;
import ua.job4j.cars.model.Engine;

import java.util.List;

@Service
public class EngineService {
    private final EngineRepository store;

    public EngineService(EngineRepository store) {
        this.store = store;
    }

    public List<Engine> findAll() {
        return store.findAll();
    }
}
