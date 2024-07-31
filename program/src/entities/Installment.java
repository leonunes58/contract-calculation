package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Installment {
    private LocalDate date;
    private Double amount;

    public Installment(LocalDate date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
