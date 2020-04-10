package java_MiddleRank.thread.test.test_4;

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
                public void run(){
                    while (true){
                        char c = cs[(int) (Math.random() * cs.length)];
                        stack.push(c);
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            t.start();
            producer[i] = t;
        }

        for (int i = 0;i < consunmer.length;i++){
            Thread t = new Thread(){
                public void run(){
                    while (true){
                        System.out.println("弹出:" + stack.pull());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
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
