package ir.fshahy.k8ssvc1.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingService {
	@GetMapping
	public String get() {
		return "Hello";
	}
}
