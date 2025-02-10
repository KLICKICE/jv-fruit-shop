package core.basesyntax.services.operations;

import core.basesyntax.models.FruitTransaction;
import core.basesyntax.services.OperationHandler;
import core.basesyntax.services.StorageService;

public class SupplyOperation implements OperationHandler,
        core.basesyntax.strategy.OperationHandler {
    private StorageService storageService;

    public SupplyOperation(StorageService storageService) {
        this.storageService = storageService;
    }

    public SupplyOperation() {
    }

    @Override
    public void apply(FruitTransaction transaction) {
        storageService.add(transaction.getFruit(), transaction.getQuantity());
    }
}
