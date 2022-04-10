package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Institute {
	@Id
	@Column(name="institute_id")
	private String instituteId;
	@Column(name="institute_name")
	private String instituteName;
	@Column(name="institute_description")
	private String instituteDescription;
	@Column(name="institute_address")
	private String instituteAddress;
	private String mobile;
	private String email;
	public Institute() {
		// TODO Auto-generated constructor stub
	}
	
	public Institute(String instituteId, String instituteName, String instituteDescription, String instituteAddress,
			String mobile, String email) {
		super();
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.instituteDescription = instituteDescription;
		this.instituteAddress = instituteAddress;
		this.mobile = mobile;
		this.email = email;
	}

	public String getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getInstituteDescription() {
		return instituteDescription;
	}
	public void setInstituteDescription(String instituteDescription) {
		this.instituteDescription = instituteDescription;
	}
	public String getInstituteAddress() {
		return instituteAddress;
	}
	public void setInstituteAddress(String instituteAddress) {
		this.instituteAddress = instituteAddress;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
