package com.example.webflux_example.entity;

import com.example.webflux_example.model.SubItemModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubItem {

    private String name;

    private BigDecimal price;


    public static SubItem from(SubItemModel subItemModel) {
        return new SubItem(subItemModel.getName(), subItemModel.getPrice());
    }
}
