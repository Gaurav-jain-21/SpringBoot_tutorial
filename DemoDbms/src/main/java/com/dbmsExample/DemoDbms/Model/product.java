package com.dbmsExample.DemoDbms.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class product {
    @Id
    private int prodId;
    private String prodName;
    private int price;
}
