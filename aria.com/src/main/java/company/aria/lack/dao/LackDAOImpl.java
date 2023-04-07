package company.aria.lack.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import company.aria.lack.vo.LaStoreVO;


@Repository("lackDAO")
public class LackDAOImpl implements LackDAO{
	@Autowired
	private SqlSession sqlSession;
	
	public List<LaStoreVO> getStoreList()throws DataAccessException{
		List<LaStoreVO> storeList = sqlSession.selectList("mapper.lackstore.getStoreList");
		return storeList;
	}
	
}
