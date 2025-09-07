package org.example;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        transaction.setStatus("PENDING");
        return service.save(transaction);
    }

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return service.findAll();
    }
}
