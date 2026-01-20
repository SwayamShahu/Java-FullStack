package com.example.library_management.service.Implementation;

import com.example.library_management.model.Card;
import com.example.library_management.repository.CardRepository;
import com.example.library_management.service.CardService;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
    CardRepository cardRepository;
    @Override
    public Card getCard(int cardId) {
        return cardRepository.findById(cardId).orElse(null);
    }

    @Override
    public List<Card> getAllCard() {
        return cardRepository.findAll();
    }
}
