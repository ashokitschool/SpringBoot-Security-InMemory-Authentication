package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

	@GetMapping("/home")
	public String home() {
		String msg = "Welcome to Ashok IT Bank..!!";
		return msg;
	}

	@GetMapping("/balance")
	public String getBalance() {
		String msg = "Your current balance is : 4578 INR";
		return msg;
	}

	@GetMapping("/statement")
	public String getStmt() {
		String msg = "Your Statement Generated and Sent to your email id";
		return msg;
	}

	@GetMapping("/myloan")
	public String getMyLoan() {
		String msg = "Your Loan Amount Due : 4,50,000 INR";
		return msg;
	}

	@GetMapping("/contact")
	public String contact() {
		String msg = "Thankyou for contacting customer support, we will get back to you soon";
		return msg;
	}

}
