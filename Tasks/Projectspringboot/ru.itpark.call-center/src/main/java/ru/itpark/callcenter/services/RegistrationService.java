package ru.itpark.callcenter.services;



import ru.itpark.callcenter.forms.RegistrationForm;

public interface RegistrationService {
    /**
     * Принимает на вход данные регистрации
     * Шифрует пароль
     * Сохраняет данные в БД
     * @param form
     * @return id-сгенерированного пользователя
     */
    Long registration(RegistrationForm form);



    //Long registration(RegistrationCallsForm form);
}