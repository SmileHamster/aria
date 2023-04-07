package company.aria.lack.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import company.aria.lack.dao.LackCartDAOImpl;


@Service("lackorderService")
@Transactional(propagation=Propagation.REQUIRED)
public class LackOrderServiceImpl {
	@Autowired
	LackCartDAOImpl lackcartDAO;
	
	public int addcart(HashMap map) throws Exception{
		return lackcartDAO.insertCart(map);
	}
	
	public List cartlist(String login_id) throws Exception{
		return lackcartDAO.selectCartlist(login_id);
	}

}
