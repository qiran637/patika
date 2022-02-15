package java101.classes.odev3;

import javax.swing.plaf.IconUIResource;

public class Employye {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employye(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (1000 < salary)
            return salary * 0.03;
        else
            return 0.0;
    }

    public double bonus() {
        if (workHours > 40)
            return (workHours - 40) * 30;
        else
            return 0.0;

    }

    public double raiseSalary(int currentYear) {
        int workYear = currentYear - hireYear;
        if (workYear<10)
            return salary * 0.05;
        else if (workYear < 20)
            return salary * 0.1;
        else
            return salary * 0.15;
    }

    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raiseSalary = raiseSalary(2021);
        double salaryWithTaxAndBonus = this.salary - tax() + bonus();

        return "Adı : " + this.name +
                "\nMaaşı : " + this.salary +
                "\nÇalışma Saati : " + this.workHours +
                "\nBaşlangıç Yılı : " + this.hireYear +
                "\nVergi : " + tax +
                "\nBonus : " + bonus +
                "\nMaaş Artışı : " + raiseSalary +
                "\nVergi ve Bonuslar ile birlikte maaş : " + salaryWithTaxAndBonus +
                "\nToplam Maaş : " + (salaryWithTaxAndBonus + raiseSalary);
    }

}
