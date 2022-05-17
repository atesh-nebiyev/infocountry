package az.developia.infocountry.controller;


import az.developia.infocountry.dto.AddCommentCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    @PostMapping
    public ResponseEntity<?> addComment(
            @Valid @RequestBody AddCommentCommand command
    ){
            return null;
    }

}
