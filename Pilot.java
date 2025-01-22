class Pilot extends Employee {

    private int pilotLicenseNum;
    private boolean hasEjected;

    // Correct constructor
    public Pilot(String name, String depart, int years, int vaca, int badge, int licenseNum) {
        super(name, depart, years, vaca, badge); // Correct call to Employee constructor
        this.pilotLicenseNum = licenseNum;
    }

    public void setLicenseNum(int license) {
        pilotLicenseNum = license;
    }

    public int getLicenseNum() {
        return pilotLicenseNum;
    }

    public void eject()
    {
        System.out.println("The pilot has ejected from the plane, were are all goners!");
        hasEjected = true;
    }

    @Override
    public String toString() {
        return super.toString() + " The pilot's license number is " + pilotLicenseNum;
    }
}
