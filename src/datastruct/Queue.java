package datastruct;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class Queue {
/*
 * 	this is CircleQueue
 *
 */

    private int front, rear;
    private int queLen = 10;
    private int queArr[];

    public Queue() {
        front = 0;
        rear = 0;
        queArr = new int[queLen];
    }

    public boolean qEmpty() {
        if (front == rear) {
            return true;
        } else {
            return false;
        }
    }

    public int nextPosIndex(int pos) {
        if (pos == queLen - 1) {
            return 0;
        } else {
            return pos + 1;
        }
    }

    public void enQueue(int data) {
        if (nextPosIndex(rear) == front) {
            System.out.println("Queue was full");
        }

        rear = nextPosIndex(rear);
        queArr[rear] = data;
        System.out.println("Input data : " + data + " rear : " + rear + " front : " + front);
    }

    public int deQueue() {
        if (qEmpty()) {
            System.out.println("Queue was Empty");
            return -1;
        }
        front = nextPosIndex(front);
        System.out.println("deQueue" + " rear : " + rear + " front : " + front);
        return queArr[front];
    }

    public int qPeek() {
        return queArr[nextPosIndex(front)];
    }

}