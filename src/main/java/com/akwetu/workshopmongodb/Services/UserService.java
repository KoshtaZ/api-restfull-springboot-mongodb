package com.akwetu.workshopmongodb.Services;

import com.akwetu.workshopmongodb.exception.ObjectNotFoundExcpetion;
import com.akwetu.workshopmongodb.model.User;
import com.akwetu.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(String id){
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(()-> new ObjectNotFoundExcpetion(id));
    }
}
