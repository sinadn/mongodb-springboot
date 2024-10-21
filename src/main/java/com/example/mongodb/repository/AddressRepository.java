package com.example.mongodb.repository;

import com.example.mongodb.entity.Address;
import com.example.mongodb.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AddressRepository extends MongoRepository<Address,String>{


    @Query("{postalCode : ?0}")
    List<Address> getAddressByPostalCode(String postalCode);

    @Query("{postalCode: ?0, street: ?1}")
    List<Address> getAddressByAlleyAndStreet(String alley, String street);

    @Query("{'Student.Id' : ?0}")
    List<Address> getAddressByStudentId(String id);

    @Query(value ="{street: ?0}", count=true)
    Integer getAddressesCountByStreet(String street);

    @Query(value = "{alley:?0}", sort= "{id:1}") //ASC
    List<Address> getAddressByAlleySortById(String alley);



}