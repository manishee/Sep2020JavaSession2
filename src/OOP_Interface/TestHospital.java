//**************** Nov 2- P5 ***********
package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh=new FortisHospital();
		fh.audiologyServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.gyncServices();
		fh.physioServices();
		fh.oncologyServices();
		fh.pathalogy();
		fh.OPDServices();//independent methods
		fh.neuroServices();//independent methods
		USMedical.minFee();//static method is called using parent interface
		System.out.println(USMedical.admission_fee);//static variable
		//USMedical.admission_fee=100;
	
	
		//Top casting
		USMedical us=new FortisHospital();
		//WebDriver dr=new ChromeDriver();
		us.audiologyServices();
		us.emergencyServices();
		us.physioServices();
		us.orthoServices();
		
		//us.OPDServices();//independent methods - ref check will fail
		//us.neuroServices();//independent methods - ref check will fail
		
		//Down casting --> not allowed
		//FortisHospital fh1=(FortisHospital)new USMedical();
	
		//Top casting with another interface
		
		UKMedical uk=new FortisHospital();
		uk.ENTServices();
		uk.pediaServices();
		uk.emergencyServices();
		
	
	
	}
	
	
	
	

}
