package company.aria.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import company.aria.common_api.vo.Common_api_VO;

@Service("TestPageService")
@Transactional(propagation=Propagation.REQUIRED)
public class TestPageService {
	@Autowired
	private TestPageDAO testpagedao;
	@Autowired
	private Common_api_VO common_api_vo;
	
	public List<Common_api_VO> getStoreList()throws Exception{
		List<Common_api_VO> common_api_list = testpagedao.getStoreList();
		return common_api_list;
	}
	

}
