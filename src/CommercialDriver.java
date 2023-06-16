
public class CommercialDriver extends GenericDriver{
	private String hazardousMaterialType;
	private String carType;
	
	public CommercialDriver(String name, boolean isProvisional, 
			String materialType, String car) {
		super(name, isProvisional);
		hazardousMaterialType = materialType;
		carType = car;
		
	}
	
	public String getMaterialType() {
		return hazardousMaterialType;
	}
	
	public void setMedicalReport() {
		medicalReport = "Approved to drive " + carType;
	}
	
}
