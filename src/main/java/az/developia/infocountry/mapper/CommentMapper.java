package az.developia.infocountry.mapper;

import az.developia.infocountry.dto.AddCommentCommand;
import az.developia.infocountry.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class CommentMapper {
public static final CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

@Mapping(target = "id", ignore = true)
@Mapping(target = "parent", ignore = true)
@Mapping(target = "user.id", source = "command.userId")
@Mapping(target = "country.id", source = "command.countryId")
@Mapping(target = "comment", source = "command.comment")
@Mapping(target = "status", constant = "ADDED")
public abstract Comment addCommentToComment(AddCommentCommand command);
}
