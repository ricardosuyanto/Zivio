package com.zivio.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zivio.project.model.item;
import com.zivio.project.repository.itemRep;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/item")
public class itemController {
    @Autowired
    private itemRep itemRepo;

    @GetMapping
    public List<item> getAllitemss() {
        return (List<item>) itemRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<item> getitemsById(@PathVariable Long id) {
        return itemRepo.findById(id);
    }

    @PostMapping
    public item createitems(@RequestBody item items) {
        return itemRepo.save(items);
    }

    // @PutMapping("/{id}")
    // public items updateitems(@PathVariable Long id, @RequestBody items itemsData)
    // {
    // Optional<items> optionalitems = itemRepo.findById(id);
    // if (optionalitems.isPresent()) {
    // items items = optionalitems.get();
    // items.setName(itemsData.getName());
    // items.setPrice(itemsData.getPrice());
    // return itemRepo.save(items);
    // }
    // return null;
    // }

    @DeleteMapping("/{id}")
    public void deleteitems(@PathVariable Long id) {
        itemRepo.deleteById(id);
    }
}
