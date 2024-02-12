import org.example.Homeworkproject5.services.VacationService;

public class Main {

    public static void main(String[] args) {
        VacationService service = new VacationService();
        System.out.println(service.calculate(10_000,3_000,20_000));
    }
}