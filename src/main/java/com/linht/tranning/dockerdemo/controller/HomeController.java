package com.linht.tranning.dockerdemo.controller;

import com.linht.tranning.dockerdemo.model.OrderModel;
import com.linht.tranning.dockerdemo.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by linhtn on 7/8/2021.
 */
@RestController
@AllArgsConstructor
public class HomeController {
    private final OrderRepository orderRepository;

    @GetMapping("/orders")
    public ResponseEntity<List<OrderModel>> home() {
        List<OrderModel> all = orderRepository.findAll();
        return ResponseEntity.ok(all);
    }
}
