package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter with contract data:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of contract: ");
        int contractNumber = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDateTime date = LocalDateTime.parse(sc.next(),fmt);
        System.out.println("Value of contract: ");
        double valueContract = sc.nextDouble();
        System.out.print("Enter with number of intallments: ");
        int numberOfInstallments = sc.nextInt();

        Contract contract = new Contract(contractNumber, date, valueContract);
        ContractService service = new ContractService();
        List<Installment> installmentList = service.processContract(contract, numberOfInstallments);

        installmentList.forEach(installment-> {
            System.out.println(installment.getAmount());
        });

        sc.close();
    }
}