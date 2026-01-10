package com.foodapp.dao;

import com.foodapp.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveUser(User user) {
        String sql = "INSERT INTO users (id, name, email, type) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(
                sql,
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getType()
        );
    }

    public void updateUser(User user) {
        String sql = "UPDATE users SET name = ?, email = ?, type = ? WHERE id = ?";
        jdbcTemplate.update(
                sql,
                user.getName(),
                user.getEmail(),
                user.getType(),
                user.getId()
        );
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    public List<User> findAllUsers() {
        String sql = "SELECT * FROM users";

        RowMapper<User> rowMapper = (rs, rowNum) -> {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            user.setType(rs.getString("type"));
            return user;
        };

        return jdbcTemplate.query(sql, rowMapper);
    }

    public List<User> findUsersByType(String type){
        String sql = "SELECT * FROM users WHERE type = "+type+"";

        RowMapper<User> rm = (rs, rowNum) ->{
            User u = new User();
            u.setId(rs.getInt("id"));
            u.setName(rs.getString("name"));
            u.setEmail(rs.getString("email"));
            u.setType(type);
            return u;
        };
        return  jdbcTemplate.query(sql, rm);

    }

    public User findById(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new Object[]{id},
                (rs, rowNum) -> {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setEmail(rs.getString("email"));
                    user.setType(rs.getString("type"));
                    return user;
                }
        );

    }

    public User findByEmail(String email) {
        String sql = "SELECT * FROM users WHERE email = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new Object[]{email},
                (rs, rowNum) -> {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setEmail(rs.getString("email"));
                    user.setType(rs.getString("type"));
                    return user;
                }
        );
    }
}
