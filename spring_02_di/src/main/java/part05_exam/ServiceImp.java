package part05_exam;

public class ServiceImp implements Service{
	private MemDaoImp memdao;
	
	public ServiceImp() {
		
	}
	
	public void setMemDao(MemDaoImp memDao) {
		this.memdao = memDao;
	}
	
	@Override
	public void prn() {
	
		memdao.selectMethod();
	}
}
