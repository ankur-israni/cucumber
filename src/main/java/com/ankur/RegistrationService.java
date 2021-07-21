package com.ankur;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;

public class RegistrationService {

public boolean isValidUserInformation(String firstName, String lastName, String username, String password, String email){
   return !StringUtils.isAnyBlank(firstName,lastName,username,password,email) && EmailValidator.getInstance().isValid(email);
}




}
