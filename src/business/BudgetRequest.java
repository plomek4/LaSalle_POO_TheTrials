package business;

public class BudgetRequest extends Trial{
    private String entityName;
    private int budgetAmount;


    public BudgetRequest(String entityName, int budgetAmount) {
        this.entityName = entityName;
        this.budgetAmount = budgetAmount;
    }
}
