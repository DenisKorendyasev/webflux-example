package com.example.webflux_example.model;

import com.example.webflux_example.entity.SubItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubItemModel {

    private String name;

    private BigDecimal price;

    public static SubItemModel from(SubItem subItem) {
        return new SubItemModel(subItem.getName(), subItem.getPrice());
    }
}
