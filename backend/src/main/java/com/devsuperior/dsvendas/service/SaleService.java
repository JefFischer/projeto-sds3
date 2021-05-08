package com.devsuperior.dsvendas.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositoroties.SaleRepository;
import com.devsuperior.dsvendas.repositoroties.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;
    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findALL(Pageable pegeable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pegeable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGrupedyBySeller() {
        return repository.amountGrupedyBySeller();

    }
    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGrupedyBySeller() {
        return repository.successGrupedyBySeller();

    }
}
