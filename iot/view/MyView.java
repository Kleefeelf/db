package iot.view;

import iot.controller.implementation.*;
import iot.models.*;
import java.util.Scanner;

public class MyView {
    private static final String ERROR_INVALID_KEY_INPUT = MyViewOperations.ERROR_INVALID_KEY_INPUT;
    private static final String EXIT = MyViewOperations.EXIT;
    private static final String CAR             = "0";
    private static final String COST            = "1";
    private static final String CREDIT_CARD     = "2";
    private static final String DRIVER          = "3";
    private static final String DRIVER_ADDRESS  = "4";
    private static final String MANUFACTURER    = "5";
    private static final String ORDER           = "6";
    private static final String SECURITY        = "7";
    private static final String USER            = "8";
    private static final String GET_ALL         = "GA";
    private static final String GET_BY_ID       = "GI";
    private static final String UPDATE          = "U";
    private static final String CREATE          = "C";
    private static final String DELETE          = "D";
    static Scanner input = new Scanner(System.in);

    private static void printSeparator() {
        System.out.println("--------------------------------------");
    }

    private static String printMainMenu() {
        System.out.println("Choose table to work with:");
        System.out.println(CAR + "-" + "Car");
        System.out.println(COST + "-" + "Cost");
        System.out.println(CREDIT_CARD + "-" + "CreditCard");
        System.out.println(DRIVER + "-" + "Driver");
        System.out.println(DRIVER_ADDRESS + "-" + "DriverAddress");
        System.out.println(MANUFACTURER + "-" + "Manufacturer");
        System.out.println(ORDER + "-" + "Order");
        System.out.println(SECURITY + "-" + "Security");
        System.out.println(USER + "-" + "User");
        System.out.println(EXIT + "-" + "Exit");
        return input.nextLine().toUpperCase();
    }

    private static String printTableMenu() {
        System.out.println("Choose what to do");
        System.out.println(GET_ALL + "-" + "Get all rows");
        System.out.println(GET_BY_ID + "-" + "Get row by id");
        System.out.println(UPDATE + "-" + "Update row");
        System.out.println(CREATE + "-" + "Create row");
        System.out.println(DELETE + "-" + "Delete row");
        System.out.println(EXIT + "-" + "Return to main menu");
        return input.nextLine().toUpperCase();
    }

    public static void execute() {

        main_label:
        while (true) {
            Class currentClass;
            AbstractControllerImpl controller;
            MyViewOperations viewOperations;

            String mainMenuInput = printMainMenu();
            switch (mainMenuInput) {
                case CAR:
                    currentClass = Car.class;
                    controller = new CarControllerImpl();
                    break;
                case COST:
                    currentClass = Cost.class;
                    controller = new CostControllerImpl();
                    break;
                case CREDIT_CARD:
                    currentClass = CreditCard.class;
                    controller = new CreditCardControllerImpl();
                    break;
                case DRIVER:
                    currentClass = Driver.class;
                    controller = new DriverControllerImpl();
                    break;
                case DRIVER_ADDRESS:
                    currentClass = DriverAddress.class;
                    controller = new DriverAddressControllerImpl();
                    break;
                case MANUFACTURER:
                    currentClass = Manufacturer.class;
                    controller = new ManufacturerControllerImpl();
                    break;
                case ORDER:
                    currentClass = Order.class;
                    controller = new OrderControllerImpl();
                    break;
                case SECURITY:
                    currentClass = Security.class;
                    controller = new SecurityControllerImpl();
                    break;
                case USER:
                    currentClass = User.class;
                    controller = new UserControllerImpl();
                    break;
                case EXIT:
                    break main_label;
                default:
                    System.out.println(ERROR_INVALID_KEY_INPUT);
                    continue;
            }
            printSeparator();
            viewOperations = new MyViewOperations(controller, currentClass);
            table_label:
            while (true) {
                System.out.println("You are working with " + currentClass.getSimpleName() + " table");
                String tableMenuInput = printTableMenu();
                printSeparator();
                switch (tableMenuInput) {
                    case GET_ALL:
                        viewOperations.getAll();
                        break;
                    case GET_BY_ID:
                        viewOperations.get();
                        break;
                    case UPDATE:
                        viewOperations.update();
                        break;
                    case CREATE:
                        viewOperations.create();
                        break;
                    case DELETE:
                        viewOperations.delete();
                        break;
                    case EXIT:
                        break table_label;
                    default:
                        System.out.println(ERROR_INVALID_KEY_INPUT);
                }
                printSeparator();
            }
        }
    }
}
