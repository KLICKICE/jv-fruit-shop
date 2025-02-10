package core.basesyntax.services.operations;

import core.basesyntax.models.FruitTransaction;
import core.basesyntax.services.OperationHandler;
import core.basesyntax.services.StorageService;

public class BalanceOperation implements OperationHandler, core.basesyntax.strategy
        .OperationHandler {
    private StorageService storageServiceImp;

    public BalanceOperation(StorageService storageServiceImp) {
        this.storageServiceImp = storageServiceImp;
    }

    public BalanceOperation() {
    }

    @Override
    public void apply(FruitTransaction transaction) {
        String fruit = transaction.getFruit();
        int quantity = transaction.getQuantity();
        storageServiceImp.add(fruit, quantity);
    }
}
