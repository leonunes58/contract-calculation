package entities;

import java.time.LocalDateTime;
import java.util.Date;

public class Installment {
    private LocalDateTime date;
    private Double amount;

    public Installment(LocalDateTime date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
