public class Employee extends Person {
    private int id;
    private double hourlyPay;

    public Employee(int id, double hourlyPay, String firstName, String lastName) {
        super(firstName, lastName);
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public int getId() {
        return id;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRaise(){
        this.hourlyPay *= 1.15;
        return hourlyPay;
    }

    public double payDay(int hoursWorked){
        double totalPay;
        if(hoursWorked > 40){
            double overtimePay = (hoursWorked-40) * hourlyPay * 1.5;
            totalPay = overtimePay + 40 * hourlyPay;
        }else {
            totalPay = hoursWorked * hourlyPay;
        }
        return totalPay;
    }

    public String toString() {
        double Height = getHeight()/30.48;
        int feet = (int)(Height);
        int inches = (int)((Height*10) - (feet*10));
        return "Name: " + getFirstName() + " " + getLastName() + "\n" +
                "They are " + feet + " feet " + inches + " inch\n" +
                "They make $" + hourlyPay + "\n" +
                "They have the employee ID " + id + "\n";
    }
}
