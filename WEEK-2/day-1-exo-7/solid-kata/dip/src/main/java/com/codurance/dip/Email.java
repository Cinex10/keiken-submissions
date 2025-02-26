package com.codurance.dip;

import java.time.LocalDate;

public class Email extends Notification {
   Email(String to, String subject, String message) {
       super(to, subject, message);
   }


}
