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
public class ListItem {
	
	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ITEM_ID")
	private ItemCategory category;
	private String description;
	private String brandTag;
	
	@OneToMany
	@JoinColumn(name="ITEM_ID")
	private List<Commentary> comments = new ArrayList<>();
}
