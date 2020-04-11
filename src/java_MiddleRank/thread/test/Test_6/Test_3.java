package java_MiddleRank.thread.test.Test_6;

public class Test_3 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] cs = str.toCharArray();

        //2个生产者
        Thread[] producer = new Thread[2];
        //3个消费者
        Thread[] consunmer = new Thread[3];

        for (int i = 0;i < producer.length;i++){
            Thread t = new Thread(){
                public void run() {
                    while (true) {
                        stack.push(cs[(int) (Math.random() * cs.length)]);
                    }
                }
            };
            t.start();
            producer[i] = t;
        }

        for (int i = 0;i < consunmer.length;i++){
            Thread t = new Thread(){
                public void run(){
                    while (true) {
                        stack.pull();
                    }
                }
            };
            t.start();
            consunmer[i] = t;
        }

        for (Thread t : producer){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Thread t : consunmer){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
