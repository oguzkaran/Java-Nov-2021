package org.csystem.app.company;

public class Manager extends Employee {
    private String m_department;
    private double m_salary;
    //...


    public String getDepartment()
    {
        return m_department;
    }

    public void setDepartment(String department)
    {
        //...
        m_department = department;
    }

    public double getSalary()
    {
        return m_salary;
    }

    public void setSalary(double salary)
    {
        //...
        m_salary = salary;
    }

    //...
}
