package datastruct.stack_problem;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class OperationStack {

    private int index, i;
    private char datas[];

    public OperationStack() {
        this.index = 0;
        this.i = 0;
        this.datas = new char[10];
    }

    public int IsEmpty() {
        return this.index;
    }

    public void pushData(char op) {
        if (index == datas.length) {
            System.out.println("stack was full");
        } else {
            this.datas[index++] = op;
            i = index;
            System.out.printf("pushing data %s", datas[index - 1]);
            System.out.println();
        }
    }

    public char popData() {
        if (index == -1) {
            System.out.println("stack was empty");
            return '\0';
        } else {
            char returnOp = this.datas[--index];
            System.out.println();
            System.out.printf("poping data %s", datas[index]);
            System.out.println();
            this.datas[index+1] = '\0';
            i = index;
            return returnOp;
        }
    }

    public char peekData() {
        return this.datas[i--];

    }

}