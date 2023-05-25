package com.zivio.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zivio.project.model.Users;
import com.zivio.project.repository.userRep;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class userController {
    @Autowired
    private userRep userRepo;

    @GetMapping
    public List<Users> getAllUserss() {
        return (List<Users>) userRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Users> getUsersById(@PathVariable Long id) {
        return userRepo.findById(id);
    }

    @PostMapping
    public Users createUsers(@RequestBody Users Users) {
        return userRepo.save(Users);
    }

    // @PutMapping("/{id}")
    // public Users updateUsers(@PathVariable Long id, @RequestBody Users UsersData)
    // {
    // Optional<Users> optionalUsers = userRepo.findById(id);
    // if (optionalUsers.isPresent()) {
    // Users Users = optionalUsers.get();
    // Users.setName(UsersData.getName());
    // Users.setPrice(UsersData.getPrice());
    // return userRepo.save(Users);
    // }
    // return null;
    // }

    @DeleteMapping("/{id}")
    public void deleteUsers(@PathVariable Long id) {
        userRepo.deleteById(id);
    }
}
