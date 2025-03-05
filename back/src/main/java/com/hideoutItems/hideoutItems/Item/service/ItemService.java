package com.hideoutItems.hideoutItems.Item.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hideoutItems.hideoutItems.Item.dto.ItemDto;
import com.hideoutItems.hideoutItems.Item.entity.Item;
import com.hideoutItems.hideoutItems.Item.mapper.ItemMapper;
import com.hideoutItems.hideoutItems.Item.repository.ItemRepository;

import java.util.Optional;

@Service
@Transactional
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Page<ItemDto> getAllItems(Pageable pageable) {
        Page<Item> itemPage = itemRepository.findAll(pageable);
        return itemPage.map(ItemMapper::toDto);
    }

    public ItemDto getItemByName(String name) {
        Item item = itemRepository.findByName(name);
        if (item == null) {
            throw new RuntimeException("Item not found with name: " + name);
        }
        return ItemMapper.toDto(item);
    }

    public ItemDto addItem(ItemDto itemDto) {
        if (itemRepository.existsByName(itemDto.getName())) {
            throw new RuntimeException("Item already exists with name: " + itemDto.getName());
        }

        Item newItem = Item.builder()
                .name(itemDto.getName())
                .description(itemDto.getDescription())
                .local(itemDto.getLocal())
                .lostDate(itemDto.getLostDate())
                .build();

        Item savedItem = itemRepository.save(newItem);
        return ItemMapper.toDto(savedItem);
    }

    public ItemDto updateItem(Long id, ItemDto itemDto) {
        Optional<Item> optionalItem = itemRepository.findById(id);
        if (optionalItem.isEmpty()) {
            throw new RuntimeException("Item not found with ID: " + id);
        }

        Item existingItem = optionalItem.get();
        existingItem.setName(itemDto.getName());
        existingItem.setDescription(itemDto.getDescription());
        existingItem.setLocal(itemDto.getLocal());
        existingItem.setLostDate(itemDto.getLostDate());

        itemRepository.save(existingItem);
        return ItemMapper.toDto(updatedItem);
    }

    public void deleteItem(Long id) {
        if (!itemRepository.existsById(id)) {
            throw new RuntimeException("Item not found with ID: " + id);
        }
        itemRepository.deleteById(id);
    }

    public boolean itemExistsByName(String name) {
        return itemRepository.existsByName(name);
    }

    public ItemDto getItemById(Long id) {
        Optional<Item> optionalItem = itemRepository.findById(id);
        if (optionalItem.isEmpty()) {
            throw new RuntimeException("Item not found with ID: " + id);
        }
        return ItemMapper.toDto(optionalItem.get());
    }
}