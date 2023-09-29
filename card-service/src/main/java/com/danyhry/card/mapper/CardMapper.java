package com.danyhry.card.mapper;

import com.danyhry.card.dto.CardDto;
import com.danyhry.card.entity.Card;

public class CardMapper {

    public static CardDto mapToCardDto(Card cards, CardDto cardDto) {
        cardDto.setCardNumber(cards.getCardNumber());
        cardDto.setCardType(cards.getCardType());
        cardDto.setMobileNumber(cards.getMobileNumber());
        cardDto.setTotalLimit(cards.getTotalLimit());
        cardDto.setAvailableAmount(cards.getAvailableAmount());
        cardDto.setAmountUsed(cards.getAmountUsed());
        return cardDto;
    }

    public static Card mapToCard(CardDto cardsDto, Card card) {
        card.setCardNumber(cardsDto.getCardNumber());
        card.setCardType(cardsDto.getCardType());
        card.setMobileNumber(cardsDto.getMobileNumber());
        card.setTotalLimit(cardsDto.getTotalLimit());
        card.setAvailableAmount(cardsDto.getAvailableAmount());
        card.setAmountUsed(cardsDto.getAmountUsed());
        return card;
    }

}
