import packageplus.SetValues;

public class Count extends SetValues{
    public int v1,v2;
    public String operator;
    Count(){
        super();
        v1 = setX();
        v2 = setY();
        operator = setOperator();
    }

    public int sum(){
        return this.v1 + this.v2;
    }

    public int sub(){
        return this.v1 - this.v2;
    }

    public int mult(){
        return this.v1 * this.v2;
    }

    public int div() {
        return this.v1 / this.v2;
    }
}
