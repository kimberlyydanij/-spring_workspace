package part01_mybatis;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemDaoImp implements MemDAO{
	
	@Autowired  //이 클래스로 생성된 빈이 자동적으로 생성됨  dispatch-mybatis 4 번과 같음
	private SqlSessionTemplate sqlSession;
	
	public MemDaoImp() {
	
	}

	 public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	 
	@Override
	public List<MemDTO> list() {
		return sqlSession.selectList("mem.all");
	}
	
	@Override
	public void insertMethod(MemDTO dto) {
		sqlSession.insert("mem.ins",dto);
	}
	
	@Override
	public void deleteMethod(int num) {
			sqlSession.delete("mem.del", num);
	}
	
	@Override
	public MemDTO updateMethod(int num) {
		return sqlSession.selectOne("mem.one", num);
	}
	
	@Override
	public void updateMethod(MemDTO dto) {
		sqlSession.update("mem.upt", dto);
	}
	
	@Override
	public MemDTO one(int num) {
		return sqlSession.selectOne("mem.one", num);
	}
	
	@Override
	public int countMethod() {
		return 0;
	}

} // end class
