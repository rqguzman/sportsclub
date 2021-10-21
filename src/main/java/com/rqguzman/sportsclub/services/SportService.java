package com.rqguzman.sportsclub.services;

import com.rqguzman.sportsclub.dto.SportDTO;
import com.rqguzman.sportsclub.entities.Sport;
import com.rqguzman.sportsclub.repositories.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SportService {

    @Autowired
    private SportRepository repository;

    @Transactional(readOnly = true)
    public List<SportDTO> findAll(){
        List<Sport> list = repository.findAll();
        return list.stream().map(x -> new SportDTO(x)).collect(Collectors.toList());
    }


}
