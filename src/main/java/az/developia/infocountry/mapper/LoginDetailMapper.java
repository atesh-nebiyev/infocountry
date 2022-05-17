package az.developia.infocountry.mapper;

import az.developia.infocountry.dto.CreateUserCommand;
import az.developia.infocountry.model.LoginDetail;
import az.developia.infocountry.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class LoginDetailMapper {
public static final LoginDetailMapper INSTANCE = Mappers.getMapper(LoginDetailMapper.class);

    public abstract LoginDetail toLoginDetail(CreateUserCommand command, User user);
}
