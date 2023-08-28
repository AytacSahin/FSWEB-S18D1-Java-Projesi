package com.workintech.burger.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BurgerErrorResponse {
    private int Status;
    private String message;
    private long timestamp;
}
