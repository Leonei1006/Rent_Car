package com.leoneigomes.rentcar.Repository;

import com.leoneigomes.rentcar.Domain.Cars;
import com.leoneigomes.rentcar.Domain.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomersRepository extends JpaRepository<Customers, Long> {

    public List<Customers> findById(String id);
    public List<Customers> findByNameContaining(String name);
    public List<Cars> findByDriver_LicenseContaining(String license_plate);
    public List<Cars> findByStartDateBetween(String Date);
}
