package string_stringBuffer_stringBuilder;

class MyTask extends Thread {
    StringBuffer sb;

    MyTask(StringBuffer sb) {
        this.sb = sb;
    }

    public void run() {
        sb.append(Thread.currentThread().getName());
    }
}
