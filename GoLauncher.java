import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Стартовый лаунчер
 */
public class GoLauncher {

    //#region Поля
    private static Scanner sc = new Scanner(System.in, "cp866");
    //#endregion
    
    /**
     * Механический запуск(с ручным заполением)
     */
    public static void start() {
        Publisher publisher = new JobAgency(); 

        while (publisher != null) {
            System.out.println();
            System.out.println("Вас приветствует автоматизированный бот-AutoSearch (работодатель/соискатель)");
            System.out.println();
            Scanner whoIAm = new Scanner(System.in, "cp866");
            System.out.println("Выберите тип пользователя:\n1 -> работодатель\n2 -> соискатель\n3 -> доп.инфо\n0 -> выйти");
            int who = whoIAm.nextInt();
            if(who == 1) {
                Company newCompany = new Company(publisher, entityName(), specialization(), jobSalary());
                System.out.println();
                List<Workers> workers = DataBaseInfo.applicants();
                int flag = 1;
                if(flag == 1) {
                    for (Workers worker : workers) {
                        if(newCompany.getVacancy().equals(worker.getVacancy()) 
                        && worker.getSalary() <= newCompany.getMaxSalary()){
                            System.out.println("Нашли соискателя!");
                            System.out.println(worker);
                        }
                    }
                }
            }
            else if(who == 2) {
                Scanner whoIAm2 = new Scanner(System.in, "cp866");
                System.out.println("Укажите уровень квалификации:\n1 -> Студент\n2 -> Опытный\n3 -> Специалист\n4 -> Junior\n5 -> Middle\n6 -> Senior");
                int who2 = whoIAm2.nextInt();
                if(who2 == 1) {
                    Workers student = new Student(jobName(), specialization());
                    System.out.println();
                    List<Company> companies = DataBaseInfo.employers();
                    for (Company company : companies) {
                        if(student.getVacancy().equals(company.getVacancy()) 
                        && company.getMaxSalary() <= student.getSalary()) {
                            System.out.println("Нашли работодателя!");
                            System.out.println(company);
                        }
                    }
                }
                else if(who2 == 2) {
                    Workers experience = new Experience(jobName(), specialization());
                    System.out.println();
                    List<Company> companies = DataBaseInfo.employers();
                    for (Company company : companies) {
                        if(experience.getVacancy().equals(company.getVacancy()) 
                        && company.getMaxSalary() <= experience.getSalary()) {
                            System.out.println("Нашли работодателя!");
                            System.out.println(company);
                        }
                    }
                }
                else if(who2 == 3) {
                    Workers master = new Master(jobName(), specialization());
                    System.out.println();
                    List<Company> companies = DataBaseInfo.employers();
                    for (Company company : companies) {
                        if(master.getVacancy().equals(company.getVacancy()) 
                        && company.getMaxSalary() <= master.getSalary()) {
                            System.out.println("Нашли работодателя!");
                            System.out.println(company);
                        }
                    }
                }
                else if(who2 == 4) {
                    Workers junior = new Junior(jobName(), specialization());
                    System.out.println();
                    List<Company> companies = DataBaseInfo.employers();
                    for (Company company : companies) {
                        if(junior.getVacancy().equals(company.getVacancy()) 
                        && company.getMaxSalary() <= junior.getSalary()) {
                            System.out.println("Нашли работодателя!");
                            System.out.println(company);
                        }
                    }
                }
                else if(who2 == 5) {
                    Workers middle = new Middle(jobName(), specialization());
                    System.out.println();
                    List<Company> companies = DataBaseInfo.employers();
                    for (Company company : companies) {
                        if(middle.getVacancy().equals(company.getVacancy()) 
                        && company.getMaxSalary() <= middle.getSalary()) {
                            System.out.println("Нашли работодателя!");
                            System.out.println(company);
                        }
                    }
                }
                else if(who2 == 6) {
                    Workers senior = new Senior(jobName(), specialization());
                    System.out.println();
                    List<Company> companies = DataBaseInfo.employers();
                    for (Company company : companies) {
                        if(senior.getVacancy().equals(company.getVacancy()) 
                        && company.getMaxSalary() <= senior.getSalary()) {
                            System.out.println("Нашли работодателя!");
                            System.out.println(company);
                        }
                    }
                }
                else System.out.println("Ошибка! Такой команды нет!");
            }
            else if(who == 3) {
                Scanner info = new Scanner(System.in, "cp866");
                System.out.println("Выбирите типо операции:\n1 -> Посмотреть всех работодателей\n2 -> Посмотреть всех соискателей");
                int infoCheck = info.nextInt();
                if(infoCheck == 1) {
                    List<Company> companies = DataBaseInfo.employers();
                    for (Company company : companies) {
                        System.out.println(company);
                    }
                }
                else if(infoCheck == 2) {
                    List<Workers> allWorkers = DataBaseInfo.applicants();
                    for (Workers workers : allWorkers) {
                        System.out.println(workers);
                    }
                }
                else System.out.println("Ошибка! Такой команды нет!");
            }
            else if(who == 0) {
                System.out.println("Работа завершена...");
                break;
            }
            else System.out.println("Ошибка! Такой команды нет!");

        }
    }
    

    /**
     * Автостарт(тест)
     */
    public static void AutoStartTest() {

        Publisher publisher = new JobAgency(); 

        //#region Компании
        Company google = new Company(publisher, "Google", "Проектировщик", 120000);
        Company google1 = new Company(publisher, "Google", "Тестировщик", 80000);
        Company yandex = new Company(publisher, "Yandex", "Инженер", 95000);
        Company geekBrains = new Company(publisher, "GeekBrains","Преподаватель",  98000);
        Company KDC = new Company(publisher, "KDC", "Бухгалтер", 50000);
        Company KDC1 = new Company(publisher, "KDC", "Разнорабочего", 50000);
        //#endregion

        //#region Соискатели
        Student student1 = new Student("Анатолий", "Разнорабочий");
        Student student2 = new Student("Вася", "Разнорабочий");
        Master master1 = new Master("Михаил", "Супервайзер");
        Master master2 = new Master("Сергей", "Бухгалтер");
        Junior junior1 = new Junior("Алексей", "Тестировщик");
        Junior junior2 = new Junior("Ринат", "Проектировщик");
        Middle middle1 = new Middle("Виолетта", "Аналитик");
        Middle middle2 = new Middle("Маша", "Разработчик");
        Senior senior1 = new Senior("Франческо", "Проектировщик");
        Senior senior2 = new Senior("Элиза", "Преподаватель");
        //#endregion

        //#region Контракты соискателей
        publisher.registerObserver(student1);
        publisher.registerObserver(student2);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(junior1);
        publisher.registerObserver(junior2);
        publisher.registerObserver(middle1);
        publisher.registerObserver(middle2);
        publisher.registerObserver(senior1);
        publisher.registerObserver(senior2);
        //#endregion

        //#region Общий список компаний
        List<Company> allCompany = new ArrayList<>();
        allCompany.add(google);
        allCompany.add(google1);
        allCompany.add(yandex);
        allCompany.add(geekBrains);
        allCompany.add(KDC);
        allCompany.add(KDC1);
        //#endregion

        //#region Рассылка вакансий с запросом
        for (Company company : allCompany) {
            company.needEmployee();
        }
        //#endregion
    }


    //#region Методы ввода
    private static String enter(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

    private static String jobName() {  // имя соискателя
        return enter("Введите ФИО: ");
    }

    private static String entityName() {  // название компании
        return enter("Введите название компании: ");
    }

    private static String specialization() {  // специализация
        return enter("Укажите специальность: ");
    }

    private static Integer jobSalary() {  // зар.плата
        int salary = Integer.parseInt(enter("Укажите сумму заработанной платы: "));
        return salary;
    }
    //#endregion

}
