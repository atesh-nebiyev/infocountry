package az.developia.infocountry.repository.impl;

import az.developia.infocountry.model.LoginDetail;
import az.developia.infocountry.repository.LoginDetailRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Slf4j
public class LoginDetailRepositoryImpl implements LoginDetailRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public LoginDetail save(LoginDetail loginDetail){
        var sql = "insert into user_login_details(user_id, email, password) values (:userId, :email, :password)";
        var params = new MapSqlParameterSource()
                .addValue("userId", loginDetail.getUser().getId())
                .addValue("email", loginDetail.getEmail())
                .addValue("password", loginDetail.getPassword());

        var updateCount = jdbcTemplate.update(sql, params);
        log.debug("user details insert count: {}", updateCount);

        return loginDetail;
    }

    @Override
    public LoginDetail update(LoginDetail entity) {
        return null;
    }

    @Override
    public Optional<LoginDetail> findById(Long aLong) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}


