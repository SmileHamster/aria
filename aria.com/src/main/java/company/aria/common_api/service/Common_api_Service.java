package company.aria.common_api.service;

import java.util.List;

import company.aria.common_api.vo.Common_api_VO;

public interface Common_api_Service {
	
	public List<Common_api_VO> getCommonApi(int pageNum,String searchCtprvnNm,int numOfRows)throws Exception;
	//public List<Common_api_VO> selectLackStoreList()throws Exception;
	//public int insertNewLackStore(Common_api_VO common_api_VO)throws Exception;
	public int searchAllStore(String searchCtprvnNm)throws Exception;

}
