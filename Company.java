import java.util.Random;

/**
 * Компания, которая нуждается в сотрудниках
 */
public class Company {

    //#region Поля
    private Random random = new Random();
    private Publisher jobAgency;
    private String name;
    private String vacancy;
    private int maxSalary;
    //#endregion

    //#region Методы
    public void needEmployee() {
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, vacancy, salary);
    }
    //#endregion

    //#region Конструктор
    public Company(Publisher jobAgency, String name, String vacancy, int maxSalary) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.vacancy = vacancy;
        this.maxSalary = maxSalary;
    }
    //#endregion

    //#region Getters
    public String getName() {
        return name;
    }

    public String getVacancy() {
        return vacancy;
    }

    public int getMaxSalary() {
        return maxSalary;
    }
    //#endregion

    @Override
    public String toString() {
        return String.format("Компания:%s; Специальность:%s; Зарплата:%d руб.", name, vacancy, maxSalary);
    }

}
