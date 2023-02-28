package com.skills421.dataservice.model;

import lombok.*;

import java.time.Instant;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Email {
    private long id;
    private String type;
    private String title;
    private String text;
    private String from;
    private long date;
}
