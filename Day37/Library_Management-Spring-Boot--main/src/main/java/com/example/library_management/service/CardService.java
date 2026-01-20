package com.example.library_management.service;

import com.example.library_management.model.Card;
import com.example.library_management.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CardService {
    public Card getCard(int CardId);
    public List<Card> getAllCard();
}
