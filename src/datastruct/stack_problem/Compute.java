package datastruct.stack_problem;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class Compute {
    private char postFix[] = null;
    private int index = 0;

    public Compute() {
        getDatas();
    }

    public int computeData() {
        OperationStack stack = null;
        char tok = '\0', op1, op2;
        stack = new OperationStack();

        for (int i = 0; i < index; i++) {
            tok = postFix[i];
            if (ConvToRPNExp.DIGIT(tok)) {
                tok -= '0';
                stack.pushData(tok);
            } else {
                op2 = stack.popData();
                op1 = stack.popData();

                switch (tok) {
                    case '+':
                        stack.pushData(op1 += op2);//error type
                        break;
                    case '-':
                        stack.pushData(op1 -= op2);
                        break;
                    case '*':
                        stack.pushData(op1 *= op2);
                        break;
                    case '/':
                        stack.pushData(op1 /= op2);
                        break;
                }

            }

        }

        return stack.popData();
    }

    private void getDatas() {
        ConvToRPNExp con = new ConvToRPNExp();
        this.postFix = new char[10];
        this.index = con.getIndex();
        this.postFix = con.getPostFix();
    }

}