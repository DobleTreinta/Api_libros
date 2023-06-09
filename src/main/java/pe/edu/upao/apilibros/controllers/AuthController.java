package pe.edu.upao.apilibros.controllers;

import pe.edu.upao.apilibros.models.User;
import pe.edu.upao.apilibros.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestParam String username,
                                         @RequestParam String password, @RequestParam String email) {
        User newUser = userService.register(username, password, email);
        return ResponseEntity.ok(newUser);
    }

    @PostMapping("/login")
    public ResponseEntity<User>login(@RequestParam String username,
                                     @RequestParam String password) {
        User user = userService.login(username, password);
        return ResponseEntity.ok(user);
    }
}