package com.eaglelabs.vlistsapi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Commentary {
	
	@Id
	private Long id;
	private String content;
	
}
