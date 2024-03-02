class Resource {
    public int x = 0;

    public synchronized void Increment(String threadName) {
        x++;
        System.out.println("Running " + threadName + ": " + x);
    }
}

public class que11 {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Thread A = new Thread() {
            public void run() {
                resource.Increment("A");
            }
        };
        Thread B = new Thread() {
            public void run() {
                resource.Increment("B");
            }
        };
        A.start();
        B.start();
    }
}
