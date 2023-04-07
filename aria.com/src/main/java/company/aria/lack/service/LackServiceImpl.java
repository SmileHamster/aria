package company.aria.lack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import company.aria.lack.dao.LackDAOImpl;
import company.aria.lack.vo.LaStoreVO;

@Service("lackService")
@Transactional(propagation=Propagation.REQUIRED)
public class LackServiceImpl implements LackService {
	@Autowired
	protected LackDAOImpl lackDAO;
	
	public List<LaStoreVO> getStoreList()throws Exception{
		return lackDAO.getStoreList();
	}
	
}
