package backendems.controllers.json;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backendems.entities.Expense;
import backendems.services.ExpenseService;

@RestController
@RequestMapping("expenses")
public class ExpenseController
{
    @Autowired
    private ExpenseService expenseService;


    @GetMapping
    public List<Expense> get()
    {
        List<Expense> result = new ArrayList<Expense>();
        expenseService.findAll().forEach(result::add);
        return result;
    }

    @PostMapping(consumes = "application/json",produces = "application/json")
    public Expense save(@RequestBody Expense expenses){
           return expenseService.save(expenses);
    }

    @PutMapping(value="/{id}",consumes = "application/json",produces = "application/json")
    public Expense update(@PathVariable(name = "id",required = true)Long id,@RequestBody Expense expenses){
           return expenseService.save(expenses);
    }

    @DeleteMapping( value="/{id}" ,consumes = "application/json",produces = "application/json")
    public void delete(@PathVariable(name = "id",required = true)Long id){
            expenseService.delete(id);;
    }
}