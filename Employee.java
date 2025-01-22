public class Employee implements  Comparable<Employee> {
    private String empName;
    private String empDepartment;
    private int empYearsExp;
    private int empVacation;
    private int empBadgeNumber;


    public Employee(){

    }

    public Employee(String name, String depart, int years, int vaca, int badge){
        setName(name);
        setDepart(depart);
        setYears(years);
        setVaca(vaca);
        setBadge(badge);
    }

    public void setName(String name){
        empName = name;
    }

    public String getName(){
        return empName;
    }

    public void setDepart(String depart){
        empDepartment = depart;
    }

    public String getDepart(){
        return empDepartment;
    }

    public void setYears(int years){
        empYearsExp = years;
    }

    public int getYears(){
        return empYearsExp;
    }

    public void setVaca(int vaca){
        empVacation = vaca;
    }

    public int getVaca(){
        return empVacation;
    }

    public void setBadge(int badge){
        empBadgeNumber = badge;
    }

    public int getBadge(){
        return empBadgeNumber;
    }

    public void copy(Employee stats){
        empName = stats.empName;
        empDepartment = stats.empDepartment;
        empVacation = stats.empVacation;
        empBadgeNumber = stats.empBadgeNumber;
        empYearsExp = stats.empYearsExp;
    }


    public boolean equals(Employee employeeOne) {
        if (empYearsExp == employeeOne.empYearsExp) {
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString(){
        String item = "";
        item = item + empName + " ID: " + empBadgeNumber + " has worked in the " + empDepartment + " department for " + empYearsExp + " years and has accumulated vacation time amounting to " + empVacation + " hours.";
        return item;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
