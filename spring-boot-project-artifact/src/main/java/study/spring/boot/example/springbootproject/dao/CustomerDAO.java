package study.spring.boot.example.springbootproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import study.spring.boot.example.springbootproject.model.Customer;

import java.util.List;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {
    @Override
    List<Customer> findAll();
}
