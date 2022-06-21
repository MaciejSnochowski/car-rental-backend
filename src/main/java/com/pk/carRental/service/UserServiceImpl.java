package com.pk.carRental.service;

import com.pk.carRental.model.User;
import com.pk.carRental.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public  class UserServiceImpl  implements  UserService {
    private UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }




    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getUser(Long id) {
      return  userRepository.findUserById(id);


    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        boolean exists=userRepository.existsById(id);
        if(exists){ userRepository.deleteAllById(id);}else {
            System.out.println("User not found");
        }

    }


}
