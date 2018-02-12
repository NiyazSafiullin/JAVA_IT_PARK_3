package ru.itpark.callcenter.services;


import ru.itpark.callcenter.forms.RegistrationServicesForms;
import ru.itpark.callcenter.models.Services;
import ru.itpark.callcenter.models.User;

import java.util.List;

public interface RegistrationServices {
    /**
     * Принимает на вход данные регистрации
     * Шифрует пароль
     * Сохраняет данные в БД
     * @param form
     * @return id-сгенерированного пользователя
     */
    String registrationServices(RegistrationServicesForms form);
    Services getServices(Long servicesId);
    List<Services> getServices(String orderBy);
}
