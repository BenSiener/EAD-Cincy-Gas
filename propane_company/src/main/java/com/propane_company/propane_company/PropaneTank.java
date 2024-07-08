package com.propane_company.propane_company;

import jakarta.persistence.*;

import java.sql.Date;


@Entity
@Table(name = "propane_tank")
public class PropaneTank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "propane_tank_id")
    private Integer propaneTankId;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    @Column(name = "delivery_date")
    private Date deliveryDate;

    @Column(name = "delivery_status")
    private String deliveryStatus;

    @Column(name = "tank_size")
    private Integer tankSize;

    public Integer getPropaneTankId() {
        return propaneTankId;
    }

    public void setPropaneTankId(Integer propaneTankId) {
        this.propaneTankId = propaneTankId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Integer getTankSize() {
        return tankSize;
    }

    public void setTankSize(Integer tankSize) {
        this.tankSize = tankSize;
    }
}
