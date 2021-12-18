package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		
    Automation obj = new Automation();
    obj.python();
    obj.Selenium();
    obj.Java();
    obj.ruby();
	
	}

	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("I'm Selenium!!!!");
	}

	@Override
	public void Java() {
		System.out.println("I'm java!!!!");
		
	}

	@Override
	public void ruby() {
		System.out.println("I'm Ruby!!!!");
		
	}

}
