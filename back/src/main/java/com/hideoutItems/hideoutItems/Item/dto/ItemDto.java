package com.hideoutItems.hideoutItems.Item.dto;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private Long Id;
    private String name;
    private String description;
    private String local;
    private LocalDateTime lostDate;
}
