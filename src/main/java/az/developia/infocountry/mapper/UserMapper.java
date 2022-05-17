package az.developia.infocountry.mapper;

import az.developia.infocountry.dto.CreateUserCommand;
import az.developia.infocountry.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class UserMapper {
    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "id", ignore = true)
    public abstract User createUserCommandToUser(CreateUserCommand command);

}
