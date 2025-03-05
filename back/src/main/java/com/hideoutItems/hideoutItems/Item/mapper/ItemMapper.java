package com.hideoutItems.hideoutItems.Item.mapper;

import com.hideoutItems.hideoutItems.Item.dto.ItemDto;
import com.hideoutItems.hideoutItems.Item.entity.Item;

public class ItemMapper {

    public static ItemDto toDto(Item item) {
        return new ItemDto(
                item.getId(),
                item.getName(),
                item.getDescription(),
                item.getLocal(),
                item.getLostDate()
        );
    }

    public static Item toEntity(ItemDto itemDto) {
        return Item.builder()
                .id(itemDto.getId())
                .name(itemDto.getName())
                .description(itemDto.getDescription())
                .local(itemDto.getLocal())
                .lostDate(itemDto.getLostDate())
                .build();
    }
}