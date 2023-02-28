package com.skills421.dataservice;

import com.skills421.dataservice.model.Activity;
import com.skills421.dataservice.model.Email;
import com.skills421.dataservice.model.Expense;
import com.skills421.dataservice.utils.DateUtils;

import java.util.List;

public class DummyDate {
    public static List<Object> getDummyData() throws Exception {
        return List.of(
                Email.builder()
                        .id(1)
                        .type("email")
                        .title("How are you doing?")
                        .text("To help with your job hunting JobServe has identified this job which may be of interest to you.")
                        .from("janedoe@gmail.com")
                        .date(DateUtils.parseUKDate("30/01/2023"))
                        .build(),
                Expense.builder()
                        .id(2)
                        .type("expense")
                        .description("usbc-c cables")
                        .text("pack of 2 usbc-c cables, 1 metre in length")
                        .amount(12.64)
                        .date(DateUtils.parseUKDate("06/02/2023"))
                        .build(),
                Activity.builder()
                        .id(3)
                        .type("activity")
                        .description("House of Illusions")
                        .text("great family day out - explore the mysteries of illusion")
                        .location("Liverpool")
                        .date(DateUtils.parseUKDate("11/02/2023"))
                        .build(),
                Activity.builder()
                        .id(4)
                        .type("activity")
                        .description("House of Illusions")
                        .text("great family day out - explore the mysteries of illusion")
                        .location("Liverpool")
                        .date(DateUtils.parseUKDate("11/02/2023"))
                        .build(),
                Activity.builder()
                        .id(5)
                        .type("activity")
                        .description("House of Illusions")
                        .text("great family day out - explore the mysteries of illusion")
                        .location("Liverpool")
                        .date(DateUtils.parseUKDate("11/02/2023"))
                        .build(),
                Activity.builder()
                        .id(6)
                        .type("activity")
                        .description("Swimming")
                        .text("Every wednesday for ten weeks")
                        .location("Oval Centre")
                        .date(DateUtils.parseUKDate("11/02/2023 14:00:00"))
                        .build(),
                Activity.builder()
                        .id(7)
                        .type("activity")
                        .description("House of Illusions")
                        .text("great family day out - explore the mysteries of illusion")
                        .location("Liverpool")
                        .date(DateUtils.parseUKDate("11/02/2023"))
                        .build(),
                Activity.builder()
                        .id(8)
                        .type("activity")
                        .description("House of Illusions")
                        .text("great family day out - explore the mysteries of illusion")
                        .location("Liverpool")
                        .date(DateUtils.parseUKDate("11/02/2023"))
                        .build()
        );
    }
}
