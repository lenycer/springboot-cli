package com.example.cli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.lang.System.exit;
@Component
public class CliClient {

    @Autowired
    ScannerArgumentResolver scannerArgumentResolver;

    @Autowired
    HelloService helloService;

    public void run() {
        System.out.println("***************************");
        System.out.println("* 1. start process        *");
        System.out.println("* 2. stop process         *");
        System.out.println("*                         *");
        System.out.println("* 0. end                  *");
        System.out.println("***************************");
        System.out.printf("select command: ");
        String command = scannerArgumentResolver.argument(System.in);
        switch (command) {
            case "1":
                start();
                break;
            case "2":
                stop();
                break;
            case "0":
                end();
                break;
            default:
                System.out.println("retry command");
                break;
        }
        run();
    }

    private void start() {
        helloService.helloCli("abc");
    }

    private void stop() {
        helloService.helloCli("zxc");
    }

    private void end() {
        exit(0);
    }
}
