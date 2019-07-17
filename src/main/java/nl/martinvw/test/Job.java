package nl.martinvw.test;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Job {

    @NotEmpty(message = "mandatoryParametersMissing")
    private String name;

    @NotNull(message = "mandatoryParametersMissing")
    private Integer salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job [name=" + name + ", salary=" + salary + "]";
    }

}