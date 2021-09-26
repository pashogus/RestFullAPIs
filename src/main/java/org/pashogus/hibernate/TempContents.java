package org.pashogus.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TempContents")
public class TempContents {
	
	
	/*
	 * create table TempContents (
			contentID varchar(50),
			did varchar(50)
			)
 */
	@Column(name="contentID")
	String contentID;
	
	@Column(name="did")
	String did;
	
	public TempContents(String contentID, String did) {
		
		this.contentID = contentID;
		this.did = did;
	}

	public String getContentID() {
		return contentID;
	}

	public void setContentID(String contentID) {
		this.contentID = contentID;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	
	
	
}
