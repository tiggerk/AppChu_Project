package beautychu.dao;


import java.util.List;

import beautychu.domain.ShopDetail;

public interface ShopDao {
	
	
	  ShopDetail getShopDetail(String email);
	  List<?> selectPhoto(String email);
	  List<?> selectShopList();

	}