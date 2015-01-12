package beautychu.dao;

import java.util.List;

import beautychu.domain.ShopInfo;

public interface ShopInfoDao {
	
	  List<?> getList();
	  void insertShopInfo(ShopInfo shopInfo);

	}