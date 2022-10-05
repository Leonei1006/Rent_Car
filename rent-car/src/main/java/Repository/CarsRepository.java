package Repository;

import Domain.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CarsRepository extends JpaRepository<Cars, Long> {

    public List<Cars> findById(String id);
    public List<Cars> findByNameContaining(String name);
    public List<Cars> findByLicense_plateContaining(String license_plate);
    public List<Cars> findByStartDateBetween(String Date);

}
