import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        // Create a pattern to be searched

        String dateFormat1 ="(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sept|Oct|Nov|Dec) (0[1-9]|[1-2][0-9]|3[0-1]|[1-9]), \\d{4}|"; 
        // dateFormat1 matches date in form of "Month Day, Year", allowing single_digit day
        // for example, May 14, 2020
        String dateFormat2 = "(0[1-9]|[1-2][0-9]|3[0-1]|[1-9]) (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sept|Oct|Nov|Dec), \\d{4}|";
        // dateFormat2 matches date in form of "Day Month, Year", allowing single-digit day
        // for example, 14 May, 2020
        String dateFormat3 = "(0[1-9]|[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1]|[1-9])/([0-9][0-9]|)[0-9][0-9]|";
        // dateFormat3 matches date in forms of MM/DD/YYYY and MM/DD/YY, allowing single-digit month and day
        // for example, 05/14/2020 and 05/14/20
        String dateFormat4 = "\\d{4}/(0[1-9]|[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1]|[1-9])|";
        // dateFormat4 matches date in form of YYYY/MM/DD, allowing signle-digit month and day
        // for example, 2020/05/14
        String dateFormat5 = "(0[1-9]|[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1]|[1-9])-([0-9][0-9]|)[0-9][0-9]";
        // dateFormat5 matches date in forms of MM-DD-YYYY and MM-DD-YY, allowing single-digit month and day
        // for example, 05-14-2020 and 05-14-20

        Pattern pattern = Pattern.compile(dateFormat1 + dateFormat2 + dateFormat3 + dateFormat4 + dateFormat5);
 
        // Search above pattern in all date format
        // Instead of reading a file, I use a string contains number of date in different formats
        String testString = "May 14, 20209 Aug, 2021sjhfskjh12 Sept, 20234 Jun,2021sjf05/16/202306/29/212002/05/14 08-9-2023 12/30/2022";
        Matcher m = pattern.matcher(testString);
 
        // Finding string using find() method
        while (m.find()){
            System.out.println("Pattern found from "
                               + m.start() + " to "
                               + (m.end() - 1));
            System.out.println(testString.substring(m.start(), m.end()));

        }
    }
}
