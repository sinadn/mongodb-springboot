package com.example.mongodb.controller;

import com.example.mongodb.entity.Address;
import com.example.mongodb.entity.Course;
import com.example.mongodb.repository.AddressRepository;
import com.example.mongodb.repository.CourseRepository;
import com.example.mongodb.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AddressService addressService;


    @PostMapping("/addAddress")
    public Address addAddress(@RequestBody Address address) {
        return addressRepository.save(address);
    }


    @GetMapping("/getAddressByPostalCode/{postalcode}")
    public List<Address> getAddressByPostalCode(@PathVariable String postalcode) {
        return addressService.getAddressByPostalCode(postalcode);
    }

    @GetMapping("/getAddressByAlleyAndStreet/{alley}/{street}")
    public List<Address> getAddressByAlleyAndStreet(@PathVariable String alley , @PathVariable String street) {
        return addressService.getAddressByAlleyAndStreet(alley , street);
    }

    @GetMapping("/getAddressByStudentId/{StudentId}")
    public List<Address> getAddressByStudentId(@PathVariable String StudentId) {
        return addressService.getAddressByStudentId(StudentId);
    }

    @PostMapping("/getAddressesCountByStreet")
    public Integer getAddressesCountByStreet(@RequestBody Address address) {
        return addressService.getAddressesCountByStreet(address);
    }

    @GetMapping("/getAddressByAlleySortById/{alley}")
    public List<Address> getAddressByAlleySortById(@PathVariable String alley) {
        return addressService.getAddressByAlleySortById(alley);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
         addressService.delete(id);
    }

}