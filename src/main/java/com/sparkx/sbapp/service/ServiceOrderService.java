package com.sparkx.sbapp.service;

import com.sparkx.sbapp.dto.ServiceOrderDTO;
import com.sparkx.sbapp.mapper.ServiceOrderMapper;
import com.sparkx.sbapp.model.ServiceOrder;
import com.sparkx.sbapp.repository.ServiceOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceOrderService {

    @Autowired
    public ServiceOrderRepository serviceOrderRepository;

    public final ServiceOrderMapper serviceOrderMapper;

    public ServiceOrderService(ServiceOrderMapper serviceOrderMapper) {
        this.serviceOrderMapper = serviceOrderMapper;
    }

    public ServiceOrderDTO createOrder(ServiceOrderDTO serviceOrder) {
        ServiceOrder newServiceOrder;
        newServiceOrder = serviceOrderMapper.toEntity(serviceOrder);
        ServiceOrder createdServiceOrder = serviceOrderRepository.save(newServiceOrder);
        return serviceOrderMapper.toDto(createdServiceOrder);
    }

    public List<ServiceOrderDTO> getAllOrders() {
        return serviceOrderRepository.findAll().stream()
                .map(serviceOrderMapper::toDto)
                .collect(Collectors.toList());
    }

    public ServiceOrderDTO getOrderById(Long id) {
        ServiceOrder serviceOrder = serviceOrderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service Order not found"));
        return serviceOrderMapper.toDto(serviceOrder);
    }

}