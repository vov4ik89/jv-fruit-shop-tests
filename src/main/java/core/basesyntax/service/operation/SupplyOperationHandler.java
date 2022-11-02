package core.basesyntax.service.operation;

public class SupplyOperationHandler implements OperationHandler {
    @Override
    public int apply(int currentQuantity, int quantity) {
        return currentQuantity + quantity;
    }
}
