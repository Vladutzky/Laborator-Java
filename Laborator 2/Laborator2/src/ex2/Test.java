package ex2;

public class Test {
    private int var;

    public Test(){  }

    public Test(int var) {
        this.var = var;
    }

    public Test(Test test) {
        this.var = test.var;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }
}
