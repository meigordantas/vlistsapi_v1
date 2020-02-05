package com.eaglelabs.vlistsapi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemCategory {
	
	@Id
	private Long id;
	private String description;
	
}
