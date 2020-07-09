package backendems.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import backendems.entities.Expense;

@Repository
public interface ExpenseRepo extends CrudRepository<Expense,Long> {
    
}