package decorator;

interface currency{
    public void display();
}
class rupee implements currency{
    int val;
    rupee(int val){
        this.val = val;
    }
    @Override
    public void display() {
        System.out.println("The currency is Rs"+this.val);
    }
}
class dollar implements currency{
    int val;
    @Override
    public void display() {
        }
}
class usd extends dollar{
    usd(int val){
        this.val = val;
    }
    @Override
    public void display() {
        System.out.println("The currency is usd"+this.val);
    }
}
class sgd extends dollar{
    sgd(int val){ this.val = val; }
    @Override
    public void display() { System.out.println("The currency is "+this.val); }
}

abstract class decorator implements currency{
    protected currency c;
    public decorator (currency c){
        this.c=c;
    }
    public void display(currency c) {   
        c.display();
    }
}
class decousd extends decorator{

    public decousd(currency c) {
        super(c);
    }
    
    @Override
    public void display() {
        c.display();
        System.out.println("usd1276");
    }
}
class decocgd extends decorator{
    
    public decocgd(currency c) {
        super(c);
    }
    @Override
    public void display(){
        c.display();
        System.out.println("cgd62757");
    }
}

public class Decorator {
    public static void main(String[] args) {
        rupee c = new rupee(100);
        c.display();
        usd a = new usd(10);
        a.display();
        currency usd = new decousd(new usd(10));
        usd.display();
    }   
}