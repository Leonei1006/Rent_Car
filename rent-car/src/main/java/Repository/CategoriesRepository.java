package Repository;

import Domain.Cars;
import Domain.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

    public List<Categories> findById(String id);
    public List<Cars> findByNameContaining(String name);
    public List<Cars> findByLicense_plateContaining(String license_plate);

}
