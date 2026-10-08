import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;

public class EventTime_1061 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        // Read and parse start day
        String startDayLine = sc.nextLine(); // e.g., "Dia 5"
        int startDay = Integer.parseInt(startDayLine.replaceAll("[^0-9]", ""));
        
        // Read and parse start time (HH : MM : SS)
        String[] startTime = sc.nextLine().split("\\s*:\\s*");
        int startHour = Integer.parseInt(startTime[0]);
        int startMin = Integer.parseInt(startTime[1]);
        int startSec = Integer.parseInt(startTime[2]);

        // Read and parse end day
        String endDayLine = sc.nextLine();
        int endDay = Integer.parseInt(endDayLine.replaceAll("[^0-9]", ""));
        
        // Read and parse end time (HH : MM : SS)
        String[] endTime = sc.nextLine().split("\\s*:\\s*");
        int endHour = Integer.parseInt(endTime[0]);
        int endMin = Integer.parseInt(endTime[1]);
        int endSec = Integer.parseInt(endTime[2]);

        // Create LocalDateTime instances
        LocalDateTime startDateTime = LocalDateTime.of(2026, 4, startDay, startHour, startMin, startSec);
        LocalDateTime endDateTime = LocalDateTime.of(2026, 4, endDay, endHour, endMin, endSec);

        // Calculate total duration
        Duration duration = Duration.between(startDateTime, endDateTime);

        // Extract duration parts
        long days = duration.toDays();
        long hours = duration.toHoursPart();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();

        // Output results
        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");

        sc.close();
    }
}
