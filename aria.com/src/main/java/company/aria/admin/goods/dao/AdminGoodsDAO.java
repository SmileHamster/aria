package company.aria.admin.goods.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import company.aria.goods.vo.GoodsVO;
import company.aria.goods.vo.ImageFileVO;
import company.aria.order.vo.OrderVO;

public interface AdminGoodsDAO {
	public int insertNewGoods(Map newGoodsMap) throws DataAccessException;
	public List<GoodsVO>selectNewGoodsList(Map condMap) throws DataAccessException;
	public GoodsVO selectGoodsDetail(int goods_id) throws DataAccessException;
	public List selectGoodsImageFileList(int goods_id) throws DataAccessException;
	public void insertGoodsImageFile(List fileList)  throws DataAccessException;
	public void updateGoodsInfo(Map goodsMap) throws DataAccessException;
	public void updateGoodsImage(List<ImageFileVO> imageFileList) throws DataAccessException;
	public void deleteGoodsImage(int image_id) throws DataAccessException;
	public void deleteGoodsImage(List fileList) throws DataAccessException;
	public List<OrderVO> selectOrderGoodsList(Map condMap) throws DataAccessException;
	public void updateOrderGoods(Map orderMap) throws DataAccessException;
	
}
