import java.util.List;

public class OldFashionPound implements OperationInterface {
    private int pounds;
    private int shillings;
    private int pence;

    public OldFashionPound() {
    }

    public OperationInterface add(OperationInterface o) {
        int result = this.convertToPence() + o.convertToPence();
        return ConvertedOperation.reconvert(result);
    }

    public OperationInterface sub(OperationInterface o) {
        int result = this.convertToPence() - o.convertToPence();
        return ConvertedOperation.reconvert(result);
    }

    public OperationInterface mul(int m) {
        int result = this.convertToPence() * m;
        return ConvertedOperation.reconvert(result);
    }

    public OperationInterface div(int d) {
        int result = this.convertToPence() / d;
        return ConvertedOperation.reconvert(result);
    }

    public int convertToPence() {
        return this.pounds * 240 + this.shillings * 12 + this.pence;
    }
}
