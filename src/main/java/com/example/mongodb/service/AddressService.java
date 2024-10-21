package com.example.mongodb.service;

import com.example.mongodb.entity.Address;
import com.example.mongodb.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;


    public void add(Address address){
        addressRepository.save(address);
    }


    public List<Address> getAddressByPostalCode(String postalCode){
       return addressRepository.getAddressByPostalCode(postalCode);
    }


    public List<Address> getAddressByAlleyAndStreet(String alley , String street){
        return addressRepository.getAddressByAlleyAndStreet(alley , street);
    }


    public List<Address> getAddressByStudentId(String id){
        return addressRepository.getAddressByStudentId(id);
    }


    public Integer getAddressesCountByStreet(Address address){
        return addressRepository.getAddressesCountByStreet(address.getStreet());
    }


    public List<Address> getAddressByAlleySortById(String alley){
        return addressRepository.getAddressByAlleySortById(alley);
    }


    public  void delete(String id){
         addressRepository.deleteById(id);
    }

}
