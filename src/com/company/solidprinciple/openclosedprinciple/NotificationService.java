package com.company.solidprinciple.openclosedprinciple;

public interface NotificationService {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);
}
