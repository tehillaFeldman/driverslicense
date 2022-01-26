class license{

  String driverName;
  String driverAddress;
  String driverState;
  double driverHeight;
  int driverWeight;
  String driverHairColor;
  String driverEyeColor;
  String driverLicenseNumber;
  static int licenseCount = 1000;

public String generateDriverLicenseNumber(String driverState){
  driverLicenseNumber = driverState + licenseCount;
  licenseCount++;
  return driverLicenseNumber;
}

/*Accessor and Mutator methods for variables */
  public String getDriverName(){
    return driverName;
  }
  public void setDriverName(String newDriverName){
    driverName = newDriverName;
  }

  public String getDriverAddress(){
    return driverAddress;
  }
  public void setDriverAddress(String newDriverAddress){
    driverAddress = newDriverAddress;
  }

  public String getDriverState(){
    return driverState;
  }
  public void setDriverState(String newDriverState){
    driverState = newDriverState;
  }

  public double getDriverHeight(){
    return driverHeight;
  }
  public void setDriverHeight(double newDriverHeight){
    driverHeight = newDriverHeight;
  }

  public int getDriverWeight(){
    return driverWeight;
  }
  public void setDriverWeight(int newDriverWeight){
    driverWeight = newDriverWeight;
  }

  public String getDriverHairColor(){
    return driverHairColor;
  }
  public void setDriverHairColor(String newDriverHairColor){
    driverHairColor = newDriverHairColor;
  }

  public String getDriverEyeColor(){
    return driverEyeColor;
  }
  public void setDriverEyeColor(String newDriverEyeColor){
    driverEyeColor = newDriverEyeColor;
  }

  public String getDriverLicenseNumber(){
    return driverLicenseNumber;
  }
  public void setDriverLicenseNumber(String newDriverLicenseNumber){
    driverLicenseNumber = newDriverLicenseNumber;
  }
}