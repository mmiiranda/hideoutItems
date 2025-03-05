package com.hideoutItems.hideoutItems.Item.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hideoutItems.hideoutItems.Item.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    boolean existsByName(String name);
    Item findByName(String name);
}

