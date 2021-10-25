package net.yorksolutions.customerapi.repository;

import net.yorksolutions.customerapi.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
//    void delete(Optional<Customer> customer);
}
