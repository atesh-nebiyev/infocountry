package az.developia.infocountry.repository.impl;

import az.developia.infocountry.model.President;
import az.developia.infocountry.repository.PresidentRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PresidentRepositoryImpl implements PresidentRepository {

    @Override
    public President save(President entity) {
        return null;
    }

    @Override
    public President update(President entity) {
        return null;
    }

    @Override
    public Optional <President> findById(Long aLong) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
