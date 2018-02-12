package temp;
import temp.RegistrationClients;

public interface RegistrationClient {
    /**
     * Принимает на вход данные регистрации
     * Шифрует пароль
     * Сохраняет данные в БД
     * @param form
     * @return id-сгенерированного пользователя
     */
    String registrationClients(RegistrationClients form);
   // Long registration_challenge (RegistrationClient form);
    //boolean confirm(String confirmString);


}
