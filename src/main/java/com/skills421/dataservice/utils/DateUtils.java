package com.skills421.dataservice.utils;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class DateUtils {
    public static long parseUKDate(String stringDate) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat(stringDate.length() == 10 ? "dd/MM/yyyy" : "dd/MM/yyyy hh:mm:ss");
        return formatter.parse(stringDate).getTime();
    }
}
