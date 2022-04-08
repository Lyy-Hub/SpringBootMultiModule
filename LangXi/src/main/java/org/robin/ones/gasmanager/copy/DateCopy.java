package org.robin.ones.gasmanager.copy;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * @author xiangtw
 * @date 2021年12月17日 10:38
 * description:
 */

@Component
public class DateCopy {
    public String asString(LocalDate date) {
        return date != null ? DateTimeFormatter.ofPattern("yyyy-MM-dd")
                .format(date) : null;
    }

    public LocalDate asDate(String date) {
        try {
            return date != null ?
            LocalDate.parse(date,DateTimeFormatter.ofPattern("yyyy-MM-dd")) : null;
        } catch (DateTimeParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String asString(LocalDateTime dateTime) {
        return dateTime != null ? DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                .format(dateTime) : null;
    }

    public LocalDateTime asDateTime(String date) {
        try {
            return date != null ?
                    LocalDateTime.parse(date,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) : null;
        } catch (DateTimeParseException e) {
            throw new RuntimeException(e);
        }
    }

}
