package cn.st.aop.usual1;

public class Horse {
    public void eat() {
        System.out.println(this.getClass().getName() + " eat!");
    }

    public void run() {
        System.out.println(this.getClass().getName() + " run!");
    }
}
