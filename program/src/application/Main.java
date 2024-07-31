package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean errorCondition = false;
        while(!errorCondition) {
            try {
                Scanner scanner = new Scanner(System.in);

                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                System.out.println("Enter with contract data:");
                Scanner sc = new Scanner(System.in);
                System.out.print("Number of contract: ");
                int contractNumber = sc.nextInt();
                System.out.print("Date (dd/MM/yyyy): ");
                LocalDate date = LocalDate.parse(sc.next(), fmt);
                System.out.println("Value of contract: ");
                double valueContract = sc.nextDouble();
                System.out.print("Enter with number of intallments: ");
                int numberOfInstallments = sc.nextInt();

                Contract contract = new Contract(contractNumber, date, valueContract);
                ContractService service = new ContractService();
                List<Installment> installmentList = service.processContract(contract, numberOfInstallments);

                installmentList.forEach(installment -> {
                    System.out.println(installment.getDate() + " - " + installment.getAmount());
                });
                errorCondition = true;
                sc.close();
            } catch (InputMismatchException e) {
                errorCondition = false;
                System.out.println("Invalid input. Try again.");
            } catch (NullPointerException e) {
                errorCondition = false;
                System.out.println("Invalid input null. Try again.");
            } catch (DateTimeParseException e) {
                errorCondition = false;
                System.out.println("Invalid input date. Try again.");
            }
        }


    }
}