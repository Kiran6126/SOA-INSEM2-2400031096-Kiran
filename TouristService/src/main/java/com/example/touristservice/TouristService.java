package com.example.touristservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {

    private final TouristRepository touristRepository;

    // Constructor injection
    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public List<Tourist> getAllTourists() {
        return touristRepository.getAllTourists();
    }
}
