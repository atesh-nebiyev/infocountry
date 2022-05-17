package az.developia.infocountry.service.impl;

import az.developia.infocountry.dto.AddCommentCommand;
import az.developia.infocountry.dto.AddCommentResponse;
import az.developia.infocountry.mapper.CommentMapper;
import az.developia.infocountry.repository.CommentRepository;
import az.developia.infocountry.repository.CountryRepository;
import az.developia.infocountry.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CountryRepository countryRepository;
    private final CommentRepository commentRepository;


    @Override
    public AddCommentResponse addComment(AddCommentCommand command) {
        log.info("ActionLog.CommentServiceImpl.addComment.start - command: {}", command);
        countryRepository.findById(command.getCountryId())
                        .orElseThrow(()-> new RuntimeException("exception.country.not-found"));

       var comment = commentRepository
               .save(CommentMapper.INSTANCE.addCommentToComment(command));


        log.info("ActionLog.CommentServiceImpl.addComment.end - command: {}", command);
        return new AddCommentResponse(comment.getId(), comment.getCountry().getId());
    }


}
