package com.srnr.bms.main;


public class CategoryService 
{
	private String categoryId;
	private String categoryName;
	public CategoryService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryService(String categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "CategoryService [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}


}
