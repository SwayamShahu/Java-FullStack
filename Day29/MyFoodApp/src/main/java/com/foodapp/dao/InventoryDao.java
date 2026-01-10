package com.foodapp.dao;

import com.foodapp.model.Inventory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public class InventoryDao {
    private JdbcTemplate jdbcTemplate;
    public InventoryDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Inventory inventory){
        jdbcTemplate.update("INSERT INTO inventory VALUES(?, ? , ?)", inventory.getId(),inventory.getPrice(), inventory.getName());
    }

    public void update(Inventory inventory){
        jdbcTemplate.update("UPDATE inventory set name = ?, price = ? where id = ?", inventory.getName(), inventory.getPrice(), inventory.getId() );

        // UPDATE inventory SET name = "ABC", price = 1234 WHERE id = 1;
    }

    public List<Inventory> findAll(){
        RowMapper<Inventory> inventoryRowMapper = (rs, rwNum) -> {
            Inventory i = new Inventory();
            i.setId(rs.getInt("id"));
            i.setName(rs.getString("name"));
            i.setPrice(rs.getDouble("price"));
            return i;
        };
        return jdbcTemplate.query("SELECT * FROM inventory", inventoryRowMapper);
    }

    public void delete(int id){
        jdbcTemplate.update("DELETE FROM inventory WHERE id= ?", id);
    }

    public Inventory findById (int id){
        return jdbcTemplate.queryForObject("SELECT * FROM inventory WHERE id =?",new Object[]{id},(rs , rowNum)->{
            Inventory inv = new Inventory();
            inv.setId(id);
            inv.setName(rs.getString("name"));
            inv.setPrice(rs.getDouble("price"));
            return inv;
        });
    }
}
