package az.developia.infocountry.service.impl;

import az.developia.infocountry.dto.CreateUserCommand;
import az.developia.infocountry.dto.UserCreatedResponse;
import az.developia.infocountry.mapper.LoginDetailMapper;
import az.developia.infocountry.mapper.UserMapper;
import az.developia.infocountry.repository.LoginDetailRepository;
import az.developia.infocountry.repository.UserRepository;
import az.developia.infocountry.service.UserService;
import az.developia.infocountry.util.PasswordUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final LoginDetailRepository loginDetailRepository;

    @Transactional
    @Override
    public UserCreatedResponse createUser(CreateUserCommand command){
        log.info("ActionLog.UserServiceImpl.createUser.start - command: {}", command);
        userRepository.findByAlias(command.getAlias())
                        .ifPresent(user -> {
                            throw new RuntimeException("exception.alias.already-exist");
                        });
        command.setPassword(PasswordUtil.hash(command.getPassword()));

        var user = UserMapper.INSTANCE.createUserCommandToUser(command);
        user = userRepository.save(user);

        var loginDetail = LoginDetailMapper.INSTANCE
                        .toLoginDetail(command, user);
        loginDetailRepository.save(loginDetail);

        log.info("ActionLog.UserServiceImpl.createUser.end - command: {}", command);
        return new UserCreatedResponse(user.getId());
    }


}
