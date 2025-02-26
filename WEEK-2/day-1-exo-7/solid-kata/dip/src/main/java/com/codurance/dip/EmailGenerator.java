package com.codurance.dip;

public class EmailGenerator extends NotificationGenerator {
    @Override
    public Notification generate(Employee employee) {
        String message = String.format("Happy birthday, dear %s!", employee.getFirstName());
        return new Email(employee.getEmail(), "Happy birthday!", message);
    }
}
