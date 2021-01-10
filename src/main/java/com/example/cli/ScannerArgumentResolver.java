package com.example.cli;

import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Scanner;

@Component
public class ScannerArgumentResolver {
    public String argument(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        return scanner.next();
    }
}
