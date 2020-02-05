package com.eaglelabs.vlistsapi.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class SomeList {
	
	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="LIST_ID")
	private ListCategory category;
	
	@OneToMany
	@JoinColumn(name="LIST_ID")
	private List<ListItem> listItems = new ArrayList<>();
	
}
