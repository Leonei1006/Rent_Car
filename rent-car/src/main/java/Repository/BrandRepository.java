package Repository;

import Domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Long> {

    public List<Brand> findById(String id);
    public List<Brand> findByNameContaining(String name);

}
