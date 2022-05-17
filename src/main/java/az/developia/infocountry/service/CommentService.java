package az.developia.infocountry.service;

import az.developia.infocountry.dto.AddCommentCommand;
import az.developia.infocountry.dto.AddCommentResponse;

public interface CommentService {
    AddCommentResponse addComment(AddCommentCommand command);

}
