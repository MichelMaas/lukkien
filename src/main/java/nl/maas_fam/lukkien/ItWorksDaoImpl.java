/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.maas_fam.lukkien;

import java.util.List;
import javax.sql.DataSource;
import nl.maas_fam.lukkien.data.ItWorks;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author michel
 */
@Repository
public class ItWorksDaoImpl implements ItWorksDao {

    private final JdbcTemplate jdbcTemplate;

    public ItWorksDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<ItWorks> getAll() {
        String sql = "select * from lukkien";
        List<ItWorks> itwList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(ItWorks.class));
        return itwList;
    }

    @Override
    public ItWorks findById(long id) {
        String sql = "SELECT * FROM contact WHERE id=" + id;
        return (ItWorks) jdbcTemplate.query(sql, new BeanPropertyRowMapper(ItWorks.class)).get(0);
    }

}
