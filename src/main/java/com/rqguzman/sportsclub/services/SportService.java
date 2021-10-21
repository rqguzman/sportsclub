package com.rqguzman.sportsclub.services;

import com.rqguzman.sportsclub.dto.SportDTO;
import com.rqguzman.sportsclub.entities.Sport;
import com.rqguzman.sportsclub.repositories.SportRepository;
import com.rqguzman.sportsclub.services.exceptions.MyDatabaseIntegrityException;
import com.rqguzman.sportsclub.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SportService {

    @Autowired
    private SportRepository repository;

    @Transactional(readOnly = true)
    public List<SportDTO> findAll() {
        List<Sport> list = repository.findAll();
        return list.stream().map(x -> new SportDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public SportDTO findById(Long id) {
        Optional<Sport> obj = repository.findById(id);
        Sport entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found!"));
        return new SportDTO(entity);
    }

    @Transactional
    public SportDTO insert(SportDTO dto) {
        Sport entity = new Sport();
        entity.setDescription(dto.getDescription());
        entity = repository.save(entity);
        return new SportDTO(entity);
    }

    @Transactional
    public SportDTO update(Long id, SportDTO dto) {
        try {
            Sport entity = repository.getOne(id);
            entity.setDescription(dto.getDescription());
            entity = repository.save(entity);
            return new SportDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Id " + id + "not found");
        }
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Id " + id + " not found");
        } catch (DataIntegrityViolationException e) {
            throw new MyDatabaseIntegrityException("Data integrity violation!");
        }
    }

}
