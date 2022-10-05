package Repository;

import Domain.Cars;
import Domain.Rentals;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentalsRepository extends JpaRepository <Rentals, Long>{

    public List<Rentals> findById(String id);
    public List<Rentals> findByNameContaining(String name);
    public List<Rentals> findByCar_IdContaining(String car_id);
    public List<Cars> findByStartDateBetween(String Date);
}
