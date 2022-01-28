package com.crown.crown.interactive.repository;

import com.crown.crown.interactive.models.BillingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingDetailsRepository extends JpaRepository<BillingDetails, Long> {

}
