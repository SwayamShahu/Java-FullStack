package com.example.demo.repository;

import com.example.demo.model.Invoice;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvoiceRepository {

    private final JdbcTemplate jdbcTemplate;

    public InvoiceRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Invoice save(Invoice invoice) {
        jdbcTemplate.update(
                "INSERT INTO invoice (customer_id, total_amount, total_tax, discount, final_amount) VALUES (?,?,?,?,?)",
                invoice.getCustomerId(),
                invoice.getTotalAmount(),
                invoice.getTotalTax(),
                invoice.getDiscount(),
                invoice.getFinalAmount()
        );
        return invoice;
    }

    public Invoice getInvoiceById(long invoiceId) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM invoice WHERE invoice_id = ?",
                new Object[]{invoiceId},
                (rs, rowNum) -> {
                    Invoice i = new Invoice();
                    i.setInvoiceId(rs.getLong("invoice_id"));
                    i.setCustomerId(rs.getLong("customer_id"));
                    i.setTotalAmount(rs.getDouble("total_amount"));
                    i.setTotalTax(rs.getDouble("total_tax"));
                    i.setDiscount(rs.getDouble("discount"));
                    i.setFinalAmount(rs.getDouble("final_amount"));
                    return i;
                }
        );
    }

    public List<Invoice> getAllInvoice() {
        return jdbcTemplate.query(
                "SELECT * FROM invoice",
                (rs, rowNum) -> {
                    Invoice i = new Invoice();
                    i.setInvoiceId(rs.getLong("invoice_id"));
                    i.setCustomerId(rs.getLong("customer_id"));
                    i.setTotalAmount(rs.getDouble("total_amount"));
                    i.setTotalTax(rs.getDouble("total_tax"));
                    i.setDiscount(rs.getDouble("discount"));
                    i.setFinalAmount(rs.getDouble("final_amount"));
                    return i;
                }
        );
    }

    public Invoice getInvoiceByCustomerId(long customerId) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM invoice WHERE customer_id = ?",
                new Object[]{customerId},
                (rs, rowNum) -> {
                    Invoice i = new Invoice();
                    i.setInvoiceId(rs.getLong("invoice_id"));
                    i.setCustomerId(rs.getLong("customer_id"));
                    i.setFinalAmount(rs.getDouble("final_amount"));
                    return i;
                }
        );
    }
}
