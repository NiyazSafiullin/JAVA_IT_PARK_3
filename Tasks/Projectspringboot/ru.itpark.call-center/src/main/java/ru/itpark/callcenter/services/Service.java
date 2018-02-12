package ru.itpark.callcenter.services;

import ru.itpark.callcenter.forms.NamesForm;
import ru.itpark.callcenter.models.Services;

import java.util.List;

public interface Service {
    List<Services> getServices(String orderBy);

    //Service getServices(Long servicesId);

    void update(Long servicesId, NamesForm form);

}
