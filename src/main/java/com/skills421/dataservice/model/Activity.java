package com.skills421.dataservice.model;

import lombok.*;

import java.time.Instant;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Activity {
    private long id;
    private String type;
    private String description;
    private String text;
    private String location;
    private long date;
}
