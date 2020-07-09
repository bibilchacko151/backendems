package backendems.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
public class Expense
{

    @Id
    private Long id;

    @NotNull
    @NotBlank
    private String particulars;
    
    @NotBlank
    @NotBlank
    private String comments;

    @NotNull
    private Double cost=0.0;

    @CreationTimestamp
    @Column(name="created_date",updatable = false)
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;


}