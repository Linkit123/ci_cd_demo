package com.linht.tranning.dockerdemo.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * Created by linhtn on 7/9/2021.
 */
@Entity
@Data
@Table(name = "orders")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uuid;
    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;

    private Instant expiredAt;
    private String status;
    private String code;
    private String merchantOrderCode;
    private Long tripId;
    private String trip;
    private Long customerId;
    private String customer;
    private Long merchantId;
    private String merchant;
    private String seatIds;
    private String seats;
    private String passengerIds;
    private String passengers;
    private String voucherCode;
    private BigDecimal originAmount;
    private BigDecimal voucherDiscountAmount;
    private Integer totalSeat;
    private BigDecimal totalAmount;
    private String note;
    private String paymentStatus;
    private String refundStatus;
    //    private String cancellationPolicy;
    private String merchantTicketCode;
    private BigDecimal refundFee;
    private BigDecimal refundAmount;
    private String refundPolicy;

    private String pointIds;
    private String points;
}
