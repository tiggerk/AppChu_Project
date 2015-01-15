package beautychu.dao;

import java.util.List;

import beautychu.domain.ShopInfo;

public interface ShopInfoDao {
	
	  List<?> getList(String email);
	  void updateShopInfo(ShopInfo shopInfo);
	  void insertPhoto(ShopInfo shopInfo);

}