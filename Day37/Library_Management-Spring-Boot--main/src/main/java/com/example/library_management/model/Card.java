package com.example.library_management.model;

import com.example.library_management.enums.Status;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardId;

    @CreationTimestamp
    private Date issueDate;
    @UpdateTimestamp
    private Date updateOn;
    private Date expiryDate;
    @Enumerated(EnumType.STRING)
    private Status cardStatus;
    @OneToOne
    @JoinColumn
    Student student;
    @OneToMany(mappedBy = "card")
    private List<Transaction> IssuedBook=new ArrayList<>();


    public Card(int cardId, Date issueDate, Date updateOn, Date expiryDate, Status cardStatus, Student student) {
        this.cardId = cardId;
        this.issueDate = issueDate;
        this.updateOn = updateOn;
        this.expiryDate = expiryDate;
        this.cardStatus = cardStatus;
        this.student = student;
    }

    public Card() {

    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Status getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(Status cardStatus) {
        this.cardStatus = cardStatus;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
