package az.developia.infocountry.repository.impl;

import az.developia.infocountry.model.Comment;
import az.developia.infocountry.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Slf4j
@RequiredArgsConstructor
public class CommentRepositoryImpl implements CommentRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;
    @Override
    public Comment save(Comment entity) {
        var sql = """
                """;
        return null;
    }

    @Override
    public Comment update(Comment entity) {
        return null;
    }

    @Override
    public Optional<Comment> findById(Long aLong) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
