package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.FormationEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class FormationRepository implements MongoRepository<FormationEntity, String> {
    @Override
    public <S extends FormationEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends FormationEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<FormationEntity> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<FormationEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<FormationEntity> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(FormationEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends FormationEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<FormationEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<FormationEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends FormationEntity> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends FormationEntity> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends FormationEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends FormationEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends FormationEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends FormationEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends FormationEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends FormationEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends FormationEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
