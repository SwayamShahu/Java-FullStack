package com.quizapp.librarymanagement.model;

import jakarta.persistence.*;
import com.quizapp.librarymanagement.Enums.Status;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CardId;

    @CreationTimestamp
    private Date issueDate;

    @UpdateTimestamp
    private Date UpdateOn;
    private Date expiryDate;

    @Enumerated(EnumType.STRING)
    private Status cardStatus;

    @OneToOne
    @JoinColumn
    Student student;

    public Card() {
    }

    public Card(int cardId, Date issueDate, Date updateOn, Date expiryDate, Status cardStatus, Student student) {
        CardId = cardId;
        this.issueDate = issueDate;
        UpdateOn = updateOn;
        this.expiryDate = expiryDate;
        this.cardStatus = cardStatus;
        this.student = student;
    }

    public int getCardId() {
        return CardId;
    }

    public void setCardId(int cardId) {
        CardId = cardId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Status getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(Status cardStatus) {
        this.cardStatus = cardStatus;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getUpdateOn() {
        return UpdateOn;
    }

    public void setUpdateOn(Date updateOn) {
        UpdateOn = updateOn;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
}
