package com.leoneigomes.rentcar.Repository;

import com.leoneigomes.rentcar.Domain.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarsRepository extends JpaRepository<Cars, Long> {

    public List<Cars> findById(String id);
    public List<Cars> findByNameContaining(String name);
    public List<Cars> findByLicense_plateContaining(String license_plate);
    public List<Cars> findByStartDateBetween(String Date);

}
