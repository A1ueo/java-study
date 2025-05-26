package homework.homework04.run;

import homework.homework04.model.vo.GalaxyS24;
import homework.homework04.model.vo.Iphone15;
import homework.homework04.model.vo.SmartPhone;

public class Run {

	public static void main(String[] args) {
		SmartPhone[] smartPhoneArr = new SmartPhone[2];
		smartPhoneArr[0] = new GalaxyS24();
		smartPhoneArr[1] = new Iphone15();

		for (SmartPhone smartPhone : smartPhoneArr) {
			int idx = smartPhone.getClass().getName().toString().lastIndexOf('.');
			System.out.print(smartPhone.getClass().getName().toString().substring(idx + 1) + "는 ");
			smartPhone.printMaker();
			System.out.println("에서 만들어 졌다.");

			smartPhone.makeCall();
			smartPhone.takeCall();
			smartPhone.touch();
			smartPhone.charge();
			smartPhone.picture();
			System.out.println("==========================");
		}

	}

}
