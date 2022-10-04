package Dominio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Cars_Images")
@Entity
public class Cars_Images{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long car_id;
    private byte image;
    private Date created_at;

    public Cars_Images() {
    }

    public Cars_Images(Long id, Long car_id, byte image, Date created_at) {
        this.id = id;
        this.car_id = car_id;
        this.image = image;
        this.created_at = created_at;
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

    public byte getImage() {
        return image;
    }

    public void setImage(byte image) {
        this.image = image;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Cars_Images{" +
                "id=" + id +
                ", car_id=" + car_id +
                ", image=" + image +
                ", created_at=" + created_at +
                '}';
    }
}
