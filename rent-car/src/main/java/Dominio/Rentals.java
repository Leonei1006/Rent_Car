package Dominio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Rentals")
@Entity
public class Rentals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private Long car_id;
    private Long customer_id;
    private Date start_date;
    private Date end_date;
    private boolean total;
    private Date created_at;
    private Date update_at;

    public Rentals() {
    }

    public Rentals(Long id, Long car_id, Long customer_id, Date start_date,
                   Date end_date, boolean total, Date created_at, Date update_at) {
        this.id = id;
        this.car_id = car_id;
        this.customer_id = customer_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.total = total;
        this.created_at = created_at;
        this.update_at = update_at;
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

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public boolean isTotal() {
        return total;
    }

    public void setTotal(boolean total) {
        this.total = total;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    @Override
    public String toString() {
        return "Rentals{" +
                "id=" + id +
                ", car_id=" + car_id +
                ", customer_id=" + customer_id +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", total=" + total +
                ", created_at=" + created_at +
                ", update_at=" + update_at +
                '}';
    }
}
