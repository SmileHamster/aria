package company.aria.bupage.dao;

import org.springframework.dao.DataAccessException;

public interface BupageDAO {
	public int addStore(String mrhstNm,String bu_id)throws DataAccessException;
	public int addStore(String bu_id)throws DataAccessException;
	/*
	 * public List<OrderVO> selectMyOrderGoodsList(String member_id) throws
	 * DataAccessException; public List selectMyOrderInfo(String order_id) throws
	 * DataAccessException; public List<OrderVO> selectMyOrderHistoryList(Map
	 * dateMap) throws DataAccessException; public void updateMyInfo(Map memberMap)
	 * throws DataAccessException; public MemberVO selectMyDetailInfo(String
	 * member_id) throws DataAccessException; public void updateMyOrderCancel(String
	 * order_id) throws DataAccessException; public int deleteMember(String
	 * login_id) throws DataAccessException;
	 */
}
