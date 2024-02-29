package com.ash;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to SBI Bank...!!";
		}
	
	@GetMapping("/transfer")
	public String transfer() {
		return "Funds tranfer initiated...!!";
		}
	
	@GetMapping("/balance")
	public String balance() {
		return "your acct balance is - 90!!";
		}
	
	@GetMapping("/aboutus")
	public String aboutus() {
		return "SBI Bank Mnageing by Indian Central govt..!!";
		}
}
