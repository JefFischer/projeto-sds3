package com.devsuperior.dsvendas.repositoroties;

import java.util.List;

import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " + "FROM Sale AS obj GROUP by obj.seller")
    List<SaleSumDTO> amountGrupedyBySeller();

    @Query("SELECT new com.devsuperior.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited),SUM(obj.deals)) " + "FROM Sale AS obj GROUP by obj.seller")
    List<SaleSuccessDTO> successGrupedyBySeller();

    

}