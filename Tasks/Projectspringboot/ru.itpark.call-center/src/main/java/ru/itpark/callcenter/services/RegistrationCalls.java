package ru.itpark.callcenter.services;


import ru.itpark.callcenter.forms.RegistrationCallsForm;

public interface RegistrationCalls {


    Long registration(RegistrationCallsForm form);
}
