package az.developia.infocountry.controller;

import az.developia.infocountry.dto.CreateUserCommand;
import az.developia.infocountry.dto.UserCreatedResponse;
import az.developia.infocountry.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserCreatedResponse> createUser(
            @RequestBody CreateUserCommand command
    ) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userService.createUser(command));
    }
}
