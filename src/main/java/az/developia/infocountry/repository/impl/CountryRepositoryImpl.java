package az.developia.infocountry.repository.impl;

import az.developia.infocountry.model.Country;
import az.developia.infocountry.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Slf4j
@RequiredArgsConstructor
public class CountryRepositoryImpl implements CountryRepository {
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public Country save(Country entity) {
        return null;
    }

    @Override
    public Country update(Country entity) {
        return null;
    }

    @Override
    public Optional<Country> findById(Long aLong) {
        try {
            var sql = """
                select id, name, region, territory, population,
                 capital, code, language, overall_rating,
                  created_at, last_updated_at
                from countries
                where id = :id
                """;
        var params = new MapSqlParameterSource()
                .addValue("id", aLong);

        var country = jdbcTemplate.queryForObject(sql, params, (rs, rowNum) -> {
            var mappedCountry = Country.builder()
                    .id(rs.getLong("id"))
                    .capital(rs.getString("capital"))
                    .code(rs.getLong("code"))
                    .language(rs.getString("language"))
                    .name(rs.getString("name"))
                    .overallRating(rs.getBigDecimal("overallRating"))
                    .population(rs.getLong("population"))
                    .region(rs.getString("region"))
                    .territory(rs.getLong("territory"))
                    .build();

            mappedCountry.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
            mappedCountry.setLastUpdatedAt(rs.getTimestamp("last_updated_at").toLocalDateTime());
            ;
            return mappedCountry;
        });
        return Optional.of(country);
       } catch(DataAccessException e){
            log.error("ActionLog.CountryRepositoryImpl.findById.error - ", e);
            return Optional.empty();

        }

    }
        @Override
        public void deleteById (Long aLong){


    }
}
