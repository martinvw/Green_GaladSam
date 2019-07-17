package nl.martinvw.test;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Person {

    @NotEmpty(message = "mandatoryParametersMissing")
    private String name;

    @NotNull(message = "mandatoryParametersMissing")
    @Valid
    private Job job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", job=" + job + "]";
    }

}