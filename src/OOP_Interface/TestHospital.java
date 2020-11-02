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
	
		//Top casting
		USMedical us=new FortisHospital();
		//WebDriver dr=new ChromeDriver();
		us.audiologyServices();
		us.emergencyServices();
		us.physioServices();
		us.orthoServices();
		
		//Down casting --> not allowed
		//FortisHospital fh1=(FortisHospital)new USMedical();
	
	
	
	
	}
	
	
	
	

}
