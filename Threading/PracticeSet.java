//Que: 1

class myclassTh extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Good morning");
            i++;
        }
    }
}

class myclassThr extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Night");
            i++;
        }
    }
}

public class PracticeSet {

    public static void main(String[] args) {

        //QUE : 1
        myclassTh m1 = new myclassTh();
        myclassThr m2 = new myclassThr();

        m1.setPriority(7);
        m2.setPriority(9);

        m1.start();
        m2.start();

        System.out.println(m1.getPriority());
        System.out.println(m2.getPriority());

        //Que: 3
    }
}
