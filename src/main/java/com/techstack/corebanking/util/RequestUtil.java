package com.techstack.corebanking.util;

import com.techstack.corebanking.stub.FCUBSHEADERType;
import com.techstack.corebanking.stub.UBSCOMPType;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;

public class RequestUtil {

    @Value("${fcubs.password}")
    private static String fcubsPassword;

    @Value("${fcubs.username}")
    private static String username;

    @Value("${fcubs.service}")
    private static String service;

    private RequestUtil() {}
    public static FCUBSHEADERType getRequestURL(Map<String, String> requestHeaders) {
        FCUBSHEADERType fcubsheader = new FCUBSHEADERType();

        // Check if requestHeaders is null
        if (requestHeaders == null) {
            throw new IllegalArgumentException("Request headers cannot be null");
        }

        fcubsheader.setSOURCE(requestHeaders.getOrDefault("SOURCE", "FCUBS"));
        fcubsheader.setUBSCOMP(requestHeaders.getOrDefault("UBSCOMP", "FCUBS").equals("FCUBS") ? UBSCOMPType.FCUBS : UBSCOMPType.valueOf(requestHeaders.get("UBSCOMP")));
        fcubsheader.setMSGID(requestHeaders.getOrDefault("MSGID", "3211411"));
        fcubsheader.setCORRELID(requestHeaders.get("CORRELID"));
        fcubsheader.setUSERID(requestHeaders.getOrDefault("USERID", username));
        fcubsheader.setPASSWORD(requestHeaders.getOrDefault("PASSWORD", fcubsPassword));
        fcubsheader.setMODULEID(requestHeaders.getOrDefault("MODULEID", ""));
        fcubsheader.setSERVICE(requestHeaders.getOrDefault("SERVICE", service));
        fcubsheader.setBRANCH(requestHeaders.getOrDefault("BRANCH", "100"));

        // OPERATION is mandatory - throw exception if not set
        String operation = requestHeaders.get("OPERATION");
        if (operation == null || operation.trim().isEmpty()) {
            throw new IllegalArgumentException("OPERATION header is required and cannot be null or empty");
        }
        fcubsheader.setOPERATION(operation);

        return fcubsheader;
    }
}
