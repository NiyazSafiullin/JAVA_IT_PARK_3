package ru.itpark.callcenter.services;

import ru.itpark.callcenter.forms.EServiceForm;
import ru.itpark.callcenter.forms.NamesForm;
import ru.itpark.callcenter.models.Eservice;
import ru.itpark.callcenter.models.User;

import java.util.List;

public interface EServices {
    Long EServiceForm(EServiceForm form);
   //Eservice getEService(Long eserviceId);
 List<Eservice> getEServices(String orderBy);
//    void update(Long eserviceId, NamesForm form);
//    Eservice getEServices(Long eserviceId);


}
