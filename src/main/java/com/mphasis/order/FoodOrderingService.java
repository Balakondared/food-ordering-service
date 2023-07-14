package com.mphasis.order;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.mphasis.Item;

public class FoodOrderingService {

	FoodOrderingServiceRepository foodOrderingServiceRepository;
	
    @Autowired
	public FoodOrderingService(FoodOrderingServiceRepository foodOrderingServiceRepository) {
    	this.foodOrderingServiceRepository = foodOrderingServiceRepository;
    }
    
    public List<ItemEntity> getItems(){
    	foodOrderingServiceRepository.findAll();
    }
}
