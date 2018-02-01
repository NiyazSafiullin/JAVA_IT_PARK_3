package ru.itpark.callcenter.services;

import ru.itpark.callcenter.forms.NamesForm;

import ru.itpark.callcenter.models.Сalls;


import java.util.List;

public interface CallsService {
    List<Сalls> getCalls(String orderBy);
    Сalls getCalls(Long callsId);
    //void update(Long callsId, NamesForm form);
}
