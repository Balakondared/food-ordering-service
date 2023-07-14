package com.mphasis.order;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FoodOrderingServiceApi {

	FoodOrderingService foodOrderingService;
	
	@Autowired
	FoodOrderingServiceApi(FoodOrderingService foodOrderingService){
		this.foodOrderingService = foodOrderingService;
	}
	
	@GetMapping(value="items")
	public List<ItemEntity> getItems(){
		return foodOrderingService.getItems();
	}
}
