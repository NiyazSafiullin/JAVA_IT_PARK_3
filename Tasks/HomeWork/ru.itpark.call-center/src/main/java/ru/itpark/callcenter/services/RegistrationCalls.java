package ru.itpark.callcenter.services;


import ru.itpark.callcenter.forms.RegistrationCallsForm;
import ru.itpark.callcenter.forms.RegistrationForm;

public interface RegistrationCalls {


    Long registration(RegistrationCallsForm form);
}
