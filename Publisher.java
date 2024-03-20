/**
 * Инициализатор
 */
public interface Publisher {

    //#region Методы
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String companyName, String vacancy, int salary);
    //#endregion

}
