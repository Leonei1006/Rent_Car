package Dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Cars_Specifications")
@Entity
public class Cars_Specifications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long car_id;
    private Long specification_id;

    public Cars_Specifications() {
    }

    public Cars_Specifications(Long id, Long car_id, Long specification_id) {
        this.id = id;
        this.car_id = car_id;
        this.specification_id = specification_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCar_id() {
        return car_id;
    }

    public void setCar_id(Long car_id) {
        this.car_id = car_id;
    }

    public Long getSpecification_id() {
        return specification_id;
    }

    public void setSpecification_id(Long specification_id) {
        this.specification_id = specification_id;
    }

    @Override
    public String toString() {
        return "Cars_Specifications{" +
                "id=" + id +
                ", car_id=" + car_id +
                ", specification_id=" + specification_id +
                '}';
    }
}
