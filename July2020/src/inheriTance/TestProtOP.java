package inheriTance;

import accessModifiers.ProtMod;

public class TestProtOP extends ProtMod {

	public static void main(String[] args) {

		TestProtOP tp = new TestProtOP();
		tp.protmethod();
		tp.protwithinpcks();
		
		ProtMod p = new ProtMod();
		
		
	}

}
