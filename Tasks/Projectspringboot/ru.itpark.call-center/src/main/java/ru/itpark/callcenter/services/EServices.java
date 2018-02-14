package ru.itpark.callcenter.services;

import ru.itpark.callcenter.forms.EServiceForm;
import ru.itpark.callcenter.forms.NamesForm;
import ru.itpark.callcenter.models.Eservice;

import java.util.List;

public interface EServices {
    String EServiceForm(EServiceForm form);
   Eservice getEService(Long eserviceId);
 List<Eservice> getEServices(String orderBy);

    void update(Long eserviceId, NamesForm form);
}
