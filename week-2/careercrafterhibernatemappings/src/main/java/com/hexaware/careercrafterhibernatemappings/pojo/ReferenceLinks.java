package com.hexaware.careercrafterhibernatemappings.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReferenceLinks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int linkId;
	
	private String link;

	public ReferenceLinks() {
		super();
	}

	public ReferenceLinks(int linkId, String link) {
		super();
		this.linkId = linkId;
		this.link = link;
	}

	public int getLinkId() {
		return linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "ReferenceLinks [linkId=" + linkId + ", link=" + link + "]";
	}
	
	
}
