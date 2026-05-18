
public class EneQueue {

    private String [] element = new String[20];
    private int count;
    private int front = 0;
    private int rear = 0;


    public boolean isEmpty() {
        return count == 0;
    }


    public int getSizeOfQueue() {
        return count;
    }



    public boolean Enqueue(String Value) {
        if(Value == null || Value.isEmpty()){
            return false;
    }

        if(count == element.length){
           return false;
            }

        element[rear] = Value;
        rear++;
        count++;
    return true;
}


    public boolean offerQueue(String Value) {
        if(Value == null || Value.isEmpty()){
            return false;
        }

        return Enqueue(Value);
    }


    public String peekIntoQueue() {

        if (isEmpty()) {
            return null;
        }

        return element[front];
    }

    public String elementInaQueue() {
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty.");
        }

        return element[front];
    }

    public String Dequeue() {
        if (isEmpty()) {
            return null;
        }

        String removedElement = element[front];

        for(int index = 0; index < count - 1; index++){
            element[index] = element[index + 1];
        }

        rear --;
        count --;

    return removedElement;
    }

    public String poll() {

        if (isEmpty()) {
            return null;
        }


        String front = element[0];

        for (int index = 1; index < count; index++) {
            element[index - 1] = element[index];
        }

       count--;
        return front;
    }
}
