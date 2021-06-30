package com.decagon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.decagon.notifications.EmailSender;
import com.decagon.notifications.impl.MailgunEmailSender;

public class App {
	public static void main(String[] args) {
		List<Staff> staffList = new ArrayList<>();

		Accountant paul = new Accountant("Paul", 2, "Edo Tech Park", "paul@gmail.com", 15000);
		// want to send an email to all staff to tell them about a public holiday
		EmailSender emailSender = new MailgunEmailSender();
		Map<String, Integer> positionSalary = new HashMap<>();
		positionSalary.put("Cleaner", 10000);
		positionSalary.put("Software Engineer", 20000);
		String name = "Hope";
		Applicant hope = new Applicant(name, 1, "Edo Tech Park", "hope@decagon.dev", "Software Engineer", 3, "BSC");
		Applicant musa = new Applicant("Musa", 2, "Edo Tech Park", "musa@decagon.dev", "Cleaner", 10, "SSCE");
		// emailSender.sendHtmlEmail("odohi.david@gmail.com", "spankie@gmail.com", "Hello David", "Hi David, I'm trying to check up on you. how is the edo state?\n");
		Ceo goodluck = new Ceo("Goodluck", 1, "Edo Tech Park, Room 119", "goodluck@gej.com", 30000, emailSender, positionSalary);

		// System.out.printf("Number of staff BEFORE hiring: %d\n", staffList.size());
		// goodluck.hire(hope, staffList);
		// System.out.printf("Number of staff AFTER hiring: %d\n", staffList.size());

		Company squadEigthLLC = new Company(goodluck, staffList, paul);

    squadEigthLLC.apply(hope);
		squadEigthLLC.apply(musa);
		// System.out.println(squadEigthLLC.getApplicants().toString());
		squadEigthLLC.hire();
    System.out.println(staffList);
  }
}
