package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		teacherCreditManager.calculate();
		
		CreditUI creditUI = new CreditUI();
		creditUI.calculateCredit( new TeacherCreditManager());
		
		CreditUI creditUI2 = new CreditUI();
		creditUI2.calculateCredit( new SoldierCreditManager());
		
		
	}

}
