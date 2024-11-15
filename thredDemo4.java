class thredDemo4 {
    public static void main(String[] args) {
        System.out.println("Inside main thread");

        Demo dobj = new Demo();
        Thread tobj = new Thread(dobj);
        tobj.setName("PPA");
        tobj.start();

    }

}

class Demo extends Thread {

    public void run() {
        System.out.println("Thread is running" + Thread.currentThread().getName());
    }
}
