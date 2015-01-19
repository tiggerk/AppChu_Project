package beautychu.dao;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import beautychu.domain.ShopInfo;
import beautychu.domain.ShopInfoPhoto;

public interface ShopInfoDao {

	List<?> getList(String email);
	void updateShopInfo(ShopInfo shopInfo);
	void insertPhoto(ShopInfoPhoto shopInfoPhoto);
	void updatePhoto(ShopInfoPhoto shopInfoPhoto);
	void fileUpload(MultipartHttpServletRequest mRequest);



}