package beautychu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.ShopInfoDao;
import beautychu.domain.ShopInfo;

@Service
public class ShopInfoService {
  @Autowired ShopInfoDao shopInfoDao;
  
  public List<?> getList() {
    return shopInfoDao.getList(); 
  }
  
	public void insertShopInfo(ShopInfo shopInfo) {
		shopInfoDao.insertShopInfo(shopInfo);
	}
}







