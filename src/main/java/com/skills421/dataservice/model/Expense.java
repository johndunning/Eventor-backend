package com.skills421.dataservice.model;

import lombok.*;

import java.time.Instant;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Expense {
    private long id;
    private String type;
    private String description;
    private String text;
    private Double amount;
    private long date;
}
