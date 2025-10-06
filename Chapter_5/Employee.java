public class Employee {
 
    private int employeeNumber;
    private double payRate;
    private static final int MAX_EMPLOYEE_NUMBER = 9999;
    private static final double MAX_RATE = 60.00;
    private static final double OVERTIME_MULTIPLIER = 1.5;
    private static final int REGULAR_HOURS_LIMIT = 40;

    public Employee() {
        this.employeeNumber = 1;
        this.payRate = 10.00;
    }

    public Employee(int employeeNumber, double payRate) {
        setEmployeeNumber(employeeNumber);
        setPayRate(payRate);
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    
    public void setEmployeeNumber(int employeeNumber) {
        if (employeeNumber <= MAX_EMPLOYEE_NUMBER) {
            this.employeeNumber = employeeNumber;
        } else {
            this.employeeNumber = MAX_EMPLOYEE_NUMBER;
            System.err.println("Warning: Employee number exceeds " + MAX_EMPLOYEE_NUMBER + ". Set to max value.");
        }
    }

    public void setPayRate(double payRate) {
        if (payRate <= MAX_RATE) {
            this.payRate = payRate;
        } else {
            this.payRate = MAX_RATE;
            System.err.println("Warning: Pay rate exceeds $" + MAX_RATE + ". Set to max value.");
        }
    }

    
    public double calculateRegularPay(double hoursWorked) {
        if (hoursWorked <= REGULAR_HOURS_LIMIT) {
            return hoursWorked * payRate;
        } else {
            return REGULAR_HOURS_LIMIT * payRate;
        }
    }

    public double calculateOvertimePay(double hoursWorked) {
        if (hoursWorked > REGULAR_HOURS_LIMIT) {
            double overtimeHours = hoursWorked - REGULAR_HOURS_LIMIT;
            double overtimeRate = payRate * OVERTIME_MULTIPLIER;
            return overtimeHours * overtimeRate;
        } else {
            return 0.0;
        }
    }
}