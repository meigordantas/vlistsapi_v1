package com.eaglelabs.vlistsapi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="LIST_TYPE")
@Data
public class ListCategory {
	
	@Id
	private Integer id;
	private String description;
}
