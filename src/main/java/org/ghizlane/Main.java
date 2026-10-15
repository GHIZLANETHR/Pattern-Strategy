package org.ghizlane;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Context context= new Context();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Quelle stratégie?");
            String strategyClassName=scanner.nextLine();
            Strategy strategy=(Strategy) Class.forName(strategyClassName).newInstance();
            context.setStrategy(strategy);
            context.effectuerOperation();

        }


    }
}