package com.example.cli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CliClient {

    @Autowired
    ScannerArgumentResolver scannerArgumentResolver;

    @Autowired
    HelloService helloService;

    public void start() {
        System.out.println("Enter processname like 'process1': ");
        String processname = scannerArgumentResolver.argument(System.in);
        helloService.helloCli(processname);
    }
}
