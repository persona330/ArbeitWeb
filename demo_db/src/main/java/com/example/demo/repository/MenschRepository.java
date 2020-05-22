package com.example.demo.repository;

import com.example.demo.entity.Phone;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface MenschRepository extends CrudRepository<Phone, Long>
{
    public List<Phone> findByName(String name);
    public List<Phone> findById(long id);
}
