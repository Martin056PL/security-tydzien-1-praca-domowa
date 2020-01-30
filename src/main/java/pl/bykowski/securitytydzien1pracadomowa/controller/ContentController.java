package pl.bykowski.securitytydzien1pracadomowa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ContentController {

    @GetMapping("/user")
    public String UserEndpoint(Principal principal) {
        return "Cześć User: " + principal.getName();
    }

    @GetMapping("/admin")
    public String AdminEndpoint(Principal principal) {
        return "Cześć Admin: " + principal.getName();
    }

    @GetMapping("/guest")
    public String GuestEndpoint() {
        return "Cześć nieznajomy!";
    }

    @GetMapping("/bye")
    public String ByeEndpoint() {
        return "Bye!";
    }


}
