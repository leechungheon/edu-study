package extraexam;

public class SwitchExample2 {
    public static void main(String[] args) {
        String day = "SAT";

        String type = switch (day) {
            case "MON", "TUE", "WED", "THU", "FRI" -> {
                System.out.println("평일입니다");
                yield "Weekday";
            }
            case "SAT", "SUN" -> {
                System.out.println("주말입니다");
                yield "Weekend";
            }
            default -> {
                yield "알 수 없음";
            }
        };

        System.out.println("타입: " + type);
    }
}
