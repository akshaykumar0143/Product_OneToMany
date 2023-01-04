package com.production.repository;

import com.production.dto.OrderResponse;
import com.production.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository <Customer, Long>{

    @Query("SELECT new package com.production.dto(c.name , p.pName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}

