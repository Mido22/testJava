
package jp.co.wap.exam;

public class Task {
    
    private int time;
    private int start; // 1 - if start time, -1 if end time


    public Task(int time, int start) {
        this.time = time;
        this.start = start;
    }
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }
    
}
