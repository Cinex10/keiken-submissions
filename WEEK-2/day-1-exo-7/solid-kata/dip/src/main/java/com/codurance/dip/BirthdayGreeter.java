package com.codurance.dip;

import java.time.MonthDay;

public class BirthdayGreeter {
    private final EmployeeRepository employeeRepository;
    private final Clock clock;

    public BirthdayGreeter(EmployeeRepository employeeRepository, Clock clock, NotificationSender notificationSender) {
        this.employeeRepository = employeeRepository;
        this.clock = clock;
    }

    public void sendGreetings(NotificationSender notificationSender, NotificationGenerator notificationGenerator) {
        MonthDay today = clock.monthDay();
        employeeRepository.findEmployeesBornOn(today)
                .stream()
                .map(notificationGenerator::generate)
                .forEach(notificationSender::send);
    }
}