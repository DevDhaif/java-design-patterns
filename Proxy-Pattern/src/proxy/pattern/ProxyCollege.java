package proxy.pattern;

public class ProxyCollege implements ICollege{
	private ICollege college = new CsItCollege();
    

	@Override
	public void studyingInCollege(int balance) throws Exception {
		// TODO Auto-generated method stub
		
		if (balance < 8000) {
			throw new Exception("Your balance is less than "
		+balance+" You can't set for exams.");
		}
		
		college.studyingInCollege(balance);
		
	}
}
