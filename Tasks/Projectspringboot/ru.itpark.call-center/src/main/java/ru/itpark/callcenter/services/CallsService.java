package ru.itpark.callcenter.services;

import ru.itpark.callcenter.models.Сalls;


import java.util.List;

public interface CallsService {
    List<Сalls> getCalls(String orderBy);
}
