package com.srnr.bms.dao;

import java.util.List;
import java.util.Optional;

import com.srnr.bms.entity.Category;

public interface CategoryDAO {

	//Inserting the category into database
	Optional<Category> insertCategory(Category category);

	//fetching the all Categories
	Optional<List<Category>> fetchAllCategory();
	
	//Updating the category name by id
	Optional<String> updateCategory(String categoryId,String categoryName);
	
	//fetching the category by id 
	Optional<Category> fetchCategoryByCategoryId(String categoryId) ;
	
}
