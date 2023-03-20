package CaseStudy.common;

import javax.swing.plaf.PanelUI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean validateVilla(String id) {
        Pattern pattern = Pattern.compile("^(SVVL)-\\d{4}$");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public static boolean validateHouse(String id) {
        Pattern pattern = Pattern.compile("^(SVHO)-\\d{4}$");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public static boolean vailidateRoom(String id) {
        Pattern pattern = Pattern.compile("^(SVRO)-\\d{4}$");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public static boolean validateServiceName(String serviceName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z ]+$");
        Matcher matcher = pattern.matcher(serviceName);
        return matcher.matches();
    }

    public static String parseLocalDatetoString(LocalDate localDate) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("DD-MM-YYY");
        return dateTimeFormatter.format(localDate);
    }

    public static LocalDate parseStringtoLocalDate(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("DD-MM-YYYY");
        LocalDate result = null;
        try {
            result = LocalDate.parse(date, dateTimeFormatter);
        } catch (DateTimeParseException e) {
            System.out.println("Mơi nhập lại định dang (DD-MM-YYY)");
        }
        return result;
    }

}
