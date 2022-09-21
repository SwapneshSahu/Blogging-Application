package com.blogging.payLoad;

import javax.validation.constraints.NotEmpty;

public class CategoryDto {

	private int categoryid;
	
	@NotEmpty(message ="Category Title Invalid")
	private String categoryTitle;

	@NotEmpty(message ="Category discription Invalid")
	private String categoryDiscription;

	
	
	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public String getCategoryDiscription() {
		return categoryDiscription;
	}

	public void setCategoryDiscription(String categoryDiscription) {
		this.categoryDiscription = categoryDiscription;
	}
	
	

}
