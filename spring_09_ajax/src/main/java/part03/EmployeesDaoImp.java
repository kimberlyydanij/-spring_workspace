package part03;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class EmployeesDaoImp implements EmployeesDAO {

	private SqlSessionTemplate sqlSession;
	
	public EmployeesDaoImp() {
	
}
	public void setSqlSession(SqlSessionTemplate sqlSesstion) {
		this.sqlSession = sqlSesstion;
	}
	
	@Override
	public List<EmployeesDTO> search(String data) {
		return sqlSession.selectList("emp.search",data);
	}

} // end class
