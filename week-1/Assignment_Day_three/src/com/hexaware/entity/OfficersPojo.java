package com.hexaware.entity;

import java.util.Objects;

public class OfficersPojo {

	private int officerId;
	private String firstName;
	private String lastName;
	private String badgeNo;
	private String contactInfo;
	private int agencyId;
	
	public OfficersPojo(){
		super();
	}
	
	public OfficersPojo(int officerId, String firstName, String lastName, String badgeNo, String contactInfo,
			int agencyId) {
		super();
		this.officerId = officerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.badgeNo = badgeNo;
		this.contactInfo = contactInfo;
		this.agencyId = agencyId;
	}
	
	public int getOfficerId() {
		return officerId;
	}
	public void setOfficerId(int officerId) {
		this.officerId = officerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBadgeNo() {
		return badgeNo;
	}
	public void setBadgeNo(String badgeNo) {
		this.badgeNo = badgeNo;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public int getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(agencyId, badgeNo, contactInfo, firstName, lastName, officerId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OfficersPojo other = (OfficersPojo) obj;
		return agencyId == other.agencyId && Objects.equals(badgeNo, other.badgeNo)
				&& Objects.equals(contactInfo, other.contactInfo) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && officerId == other.officerId;
	}

	@Override
	public String toString() {
		return "Officers [officerId=" + officerId + ", firstName=" + firstName + ", lastName=" + lastName + ", badgeNo="
				+ badgeNo + ", contactInfo=" + contactInfo + ", agencyId=" + agencyId + "]";
	}

	
}

