package datastruct.stack_problem;

import java.util.Scanner;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class ConvToRPNExp {

    private Scanner s = new Scanner(System.in);
    private int index = 0;
    char postFix[];

    public ConvToRPNExp() {
        char modify[] = new char[10];
        postFix = new char[10];
        modify = resentData();
        postFix = convToRPNExp(modify);

    }

    public char[] getPostFix() {
        return postFix;
    }

    public int getIndex() {
        return index;
    }

    public char[] convToRPNExp(char[] modify) {
        OperationStack stack = new OperationStack();
        int idx = 0;
        char tok, popOp, convExp[];
        convExp = new char[10];
        for (int i = 0; i < index; i++) {
            tok = modify[i];
            if (DIGIT(tok)) {
                convExp[idx++] = tok;
            } else {
                switch (tok) {
                    case '(':
                        stack.pushData(tok);
                        break;
                    case ')':
                        while (true) {
                            popOp = stack.popData();
                            if (popOp == '(') {
                                break;
                            }

                            convExp[idx++] = popOp;
                        }
                        break;

                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        while (!(stack.IsEmpty() == -1) && whoPrecOp(stack.peekData(), tok) >= 0) {
                            convExp[idx++] = stack.popData();
                        }
                        stack.pushData(tok);
                        break;
                }
            }

        }

        while (!(stack.IsEmpty() == 0)) {
            convExp[idx++] = stack.popData();
        }
        return convExp;

    }

    public int whoPrecOp(char op1, char op2) {

        int op1Prec = getOpPrec(op1);
        int op2Prec = getOpPrec(op2);

        if (op1Prec > op2Prec) {
            return 1;
        } else if (op1Prec < op2Prec) {
            return -1;
        } else {
            return 0;
        }
    }

    public int getOpPrec(char op) {
        switch (op) {
            case '*':
            case '/':
                return 5;

            case '+':
            case '-':
                return 3;
            case '(':
                return 1;

        }
        return -1;
    }

    public static boolean DIGIT(char op) {
        if (op == '+' || op == '-' || op == '*' || op == '-' || op == '(' || op == ')') {
            return false;
        } else {
            return true;
        }

    }

    public char[] resentData() {
        String data = s.nextLine();
        this.index = data.length();
        char modify[] = new char[10];

        for (int i = 0; i < index; i++) {
            modify[i] = data.charAt(i);
        }
        return modify;
    }

}