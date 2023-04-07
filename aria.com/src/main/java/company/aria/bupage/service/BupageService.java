package company.aria.bupage.service;

public interface BupageService{
	public int addStore(String mrhstNm,String bu_id)throws Exception;
	public int addStore(String bu_id)throws Exception;
	/*
	 * public List<OrderVO> listMyOrderGoods(String member_id) throws Exception;
	 * public List findMyOrderInfo(String order_id) throws Exception; public
	 * List<OrderVO> listMyOrderHistory(Map dateMap) throws Exception; public
	 * MemberVO modifyMyInfo(Map memberMap) throws Exception; public void
	 * cancelOrder(String order_id) throws Exception; public MemberVO
	 * myDetailInfo(String member_id) throws Exception; public int
	 * deletemember(String login_id) throws Exception;
	 */
}
