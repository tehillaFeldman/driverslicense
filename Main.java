class Main {

  public static void main(String[] args) {

    applicant1();
    applicant2();
    applicant3();

  }
    
  static void applicant1() {
    license applicant1 = new license();
    applicant1.setDriverName("Albert Smith");
    applicant1.setDriverAddress("342 Read lane");
    applicant1.setDriverHeight(4.11);
    applicant1.setDriverWeight(220);
    applicant1.setDriverHairColor("Red");
    applicant1.setDriverEyeColor("Green");
    applicant1.getDriverLicenseNumber();
    applicant1.generateDriverLicenseNumber("CA");

    System.out.print("Name: ");
    System.out.println(applicant1.getDriverName());
    System.out.print("Address: ");
    System.out.println(applicant1.getDriverAddress());
    System.out.print("Height in feet: ");
    System.out.println(applicant1.getDriverHeight());
    System.out.print("Weight in pounds: ");
    System.out.println(applicant1.getDriverWeight());
    System.out.print("Hair Color: ");
    System.out.println(applicant1.getDriverHairColor());
    System.out.print("Eye Color: ");
    System.out.println(applicant1.getDriverEyeColor());
    System.out.print("License Number: ");
    System.out.println(applicant1.getDriverLicenseNumber());
    }

  static void applicant2(){
    license applicant2 = new license();
    applicant2.setDriverName("Ellie Jane");
    applicant2.setDriverAddress("889 Berry Street");
    applicant2.setDriverHeight(5.9);
    applicant2.setDriverWeight(140);
    applicant2.setDriverHairColor("Blue");
    applicant2.setDriverEyeColor("Green");
    applicant2.generateDriverLicenseNumber("NV");

    System.out.print("Name: ");
    System.out.println(applicant2.getDriverName());
    System.out.print("Address: ");
    System.out.println(applicant2.getDriverAddress());
    System.out.print("Height in feet: ");
    System.out.println(applicant2.getDriverHeight());
    System.out.print("Weight in pounds: ");
    System.out.println(applicant2.getDriverWeight());
    System.out.print("Hair Color: ");
    System.out.println(applicant2.getDriverHairColor());
    System.out.print("Eye Color: ");
    System.out.println(applicant2.getDriverEyeColor());
    System.out.print("License Number: ");
    System.out.println(applicant2.getDriverLicenseNumber());
    }

  static void applicant3(){
    license applicant3 = new license();
    applicant3.setDriverName("Mary Jana");
    applicant3.setDriverAddress("889 Alma Street");
    applicant3.setDriverHeight(5.9);
    applicant3.setDriverWeight(120);
    applicant3.setDriverHairColor("Brown");
    applicant3.setDriverEyeColor("Green");
    applicant3.generateDriverLicenseNumber("TX");

    System.out.print("Name: ");
    System.out.println(applicant3.getDriverName());
    System.out.print("Address: ");
    System.out.println(applicant3.getDriverAddress());
    System.out.print("Height in feet: ");
    System.out.println(applicant3.getDriverHeight());
    System.out.print("Weight in pounds: ");
    System.out.println(applicant3.getDriverWeight());
    System.out.print("Hair Color: ");
    System.out.println(applicant3.getDriverHairColor());
    System.out.print("Eye Color: ");
    System.out.println(applicant3.getDriverEyeColor());
    System.out.print("License Number: ");
    System.out.println(applicant3.getDriverLicenseNumber());
    }

}
