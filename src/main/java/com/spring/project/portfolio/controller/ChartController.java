package com.spring.project.portfolio.controller;

import com.spring.project.portfolio.repository.AssetRepository;
import com.spring.project.portfolio.repository.ProfitRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portfolio/chart")
public class ChartController {
    @Autowired
    private AssetRepository assetRepository;
    
    @Autowired
    private ProfitRepository profitRepository;
    
    @GetMapping("/asset/{invid}")
    public List asset(@PathVariable("invid") Optional<Integer> id) {
        return assetRepository.findById(id.get());
    }
    
    @GetMapping("/profit/{invid}")
    public List profit(@PathVariable("invid") Optional<Integer> id) {
        return profitRepository.findById(id.get());
    }
    
    
}