package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String index() {
		return "Yen ne he!";
	}

	@GetMapping("/User")
	public String User() {
		return "Yen ne he User!";
	}

	@GetMapping("/Admin")
	public String Admin() {
		return "Yen ne he Admin!";
	}
}
