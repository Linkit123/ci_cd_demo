package com.linht.tranning.dockerdemo.repositories;

import com.linht.tranning.dockerdemo.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by link2mountain on 5/14/2021.
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderModel, Long>, JpaSpecificationExecutor<OrderModel> {
    List<OrderModel> findAllByIdIn(List<Long> orderIds);
    Optional<OrderModel> findByIdAndCustomerId(Long id, Long customerId);
}

