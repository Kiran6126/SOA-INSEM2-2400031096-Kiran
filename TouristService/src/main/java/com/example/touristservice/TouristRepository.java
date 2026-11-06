package com.example.touristservice;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    private List<Tourist> tourists;

    public TouristRepository() {
        // Pre-load three sample tourist records (no database used)
        tourists = new ArrayList<>();
        tourists.add(new Tourist(1, "Alice", "Paris"));
        tourists.add(new Tourist(2, "Bob", "Tokyo"));
        tourists.add(new Tourist(3, "Charlie", "New York"));
    }

    public List<Tourist> getAllTourists() {
        return tourists;
    }
}
