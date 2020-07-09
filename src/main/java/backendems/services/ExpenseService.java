package backendems.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backendems.entities.Expense;
import backendems.repositories.ExpenseRepo;

@Service
public class ExpenseService 
{
    
    @Autowired
    private ExpenseRepo expenseRepo;


    public Expense save(Expense expense) 
    {
       return expenseRepo.save(expense);
    }


  

    public Iterable<Expense> saveAll( Iterable<Expense> list) 
    {
       return expenseRepo.saveAll(list);
    }

    public Iterable<Expense> findAll() 
    {
        return expenseRepo.findAll();
    }


    public void  delete(Long id) 
    {
      this.expenseRepo.deleteById(id);    
    }
    
}