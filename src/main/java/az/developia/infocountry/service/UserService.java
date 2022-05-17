package az.developia.infocountry.service;

import az.developia.infocountry.dto.CreateUserCommand;
import az.developia.infocountry.dto.UserCreatedResponse;

public interface UserService {
    UserCreatedResponse createUser(CreateUserCommand command);
}
