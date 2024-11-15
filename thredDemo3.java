class thredDemo3 {
    public static void main(String[] args) {
        System.out.println("Inside main thread");

        Demo dobj = new Demo();
        Thread tobj = new Thread(dobj);
    }

}

class Demo implements Readable {

    public void run() {
        System.out.println("Thread is running");
    }
}
