package com.kodilla.good.patterns.challenge3;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println(user.name.toUpperCase() + " " + user.surname.toUpperCase() +
                " has been notified of the transaction via e-mail.");
    }
}
