package com.boshko.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger("Logger");

    //    Slf4j <- логирование
    public static void main(String[] args) {
        try {
            methodWithException();
        } catch (NumberFormatException e) {
            logger.warning(e.getMessage());
            String methodName = e.getStackTrace()[0].getMethodName();
            System.out.println(methodName);
            throw new MyUncheckedException("some problem");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
//        uncheckedExceptionMethod();
    }

    public static void methodWithException() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        logger.info(String.valueOf(i));
        logger.log(Level.INFO,String.valueOf(i));
    }

    public static void uncheckedExceptionMethod() throws MyUncheckedException {
        throw new MyUncheckedException("MyUncheckedException");
    }
}
