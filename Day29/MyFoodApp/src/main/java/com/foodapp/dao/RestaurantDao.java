package com.foodapp.dao;

import com.foodapp.model.Restaurant;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class RestaurantDao {

    private JdbcTemplate jdbcTemplate;

    public RestaurantDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveRestaurant(Restaurant restaurant) {
        String sql = "INSERT INTO restaurant (res_id, rating, latitude, longitube, radius) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(
                sql,
                restaurant.getResId(),
                restaurant.getRating(),
                restaurant.getLatitude(),
                restaurant.getLongitube(),
                restaurant.getRadius()
        );
    }

    public void updateRestaurant(Restaurant restaurant) {
        String sql = "UPDATE restaurant SET rating = ?, latitude = ?, longitube = ?, radius = ? WHERE res_id = ?";
        jdbcTemplate.update(
                sql,
                restaurant.getRating(),
                restaurant.getLatitude(),
                restaurant.getLongitube(),
                restaurant.getRadius(),
                restaurant.getResId()
        );
    }

    public void deleteRestaurant(int resId) {
        String sql = "DELETE FROM restaurant WHERE res_id = ?";
        jdbcTemplate.update(sql, resId);
    }

    public List<Restaurant> findAllRestaurants() {
        String sql = "SELECT * FROM restaurant";

        RowMapper<Restaurant> rowMapper = (rs, rowNum) -> {
            Restaurant r = new Restaurant();
            r.setResId(rs.getInt("res_id"));
            r.setRating(rs.getFloat("rating"));
            r.setLatitude(rs.getDouble("latitude"));
            r.setLongitube(rs.getDouble("longitube"));
            r.setRadius(rs.getDouble("radius"));
            return r;
        };

        return jdbcTemplate.query(sql, rowMapper);
    }

    public Restaurant findById(int resId) {
        String sql = "SELECT * FROM restaurant WHERE res_id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new Object[]{resId},
                (rs, rowNum) -> {
                    Restaurant r = new Restaurant();
                    r.setResId(rs.getInt("res_id"));
                    r.setRating(rs.getFloat("rating"));
                    r.setLatitude(rs.getDouble("latitude"));
                    r.setLongitube(rs.getDouble("longitube"));
                    r.setRadius(rs.getDouble("radius"));
                    return r;
                }
        );
    }

    public List<Restaurant> findByRating(float rating) {
        String sql = "SELECT * FROM restaurant WHERE rating >= ?";

        return jdbcTemplate.query(
                sql,
                new Object[]{rating},
                (rs, rowNum) -> {
                    Restaurant r = new Restaurant();
                    r.setResId(rs.getInt("res_id"));
                    r.setRating(rs.getFloat("rating"));
                    r.setLatitude(rs.getDouble("latitude"));
                    r.setLongitube(rs.getDouble("longitube"));
                    r.setRadius(rs.getDouble("radius"));
                    return r;
                }
        );
    }
}
