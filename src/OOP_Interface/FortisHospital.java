//************ Nov 2-P4****************
package OOP_Interface;

public class FortisHospital extends CentralizedHospital
							implements USMedical, UKMedical, IndianMedical{

	//USMedical
	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}
	
	@Override
	public void audiologyServices() {
		System.out.println("FH -- pediaServices");
	}
	
	//UKMedical
	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");
	}
	
	//IndianMedical
	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");

	}

	@Override
	public void gyncServices() {
		System.out.println("FH -- gyncServices");

	}
	
	//non-overridden method
	public void OPDServices() {
		System.out.println("FH--OPDServices ");
	}
	
	public void neuroServices() {
		System.out.println("FH -- neuroServices");
	}
	//WHO
	@Override
	public void covidTest() {
		System.out.println("FH--covidTest");
	}

	//UN
	@Override
	public void pandemicControl() {
		System.out.println("FH -- pandemicControl");
	}
	
	
}
