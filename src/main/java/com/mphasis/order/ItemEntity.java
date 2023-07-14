package com.mphasis.order;


public class ItemEntity {
    
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="fruit")
	private String fruit;
	
	@Column(name="vegetable")
	private String vegetable;
	
	@Column(name="nonVeg")
	private String nonVeg;
	
	@Column(name="breads")
	private String breads;
}
