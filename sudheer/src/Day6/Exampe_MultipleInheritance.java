package Day6;


interface Printer {
    void print();  // abstract method
}

interface Scanner {
    void scan();  // abstract method
}


class machinere implements Printer, Scanner {

    @Override
    public void scan() {
        System.out.println("Scanner message");
    }

    @Override
    public void print() {
        System.out.println("message from printer");
    }
}


public class Exampe_MultipleInheritance {
    public static void main(String[] args) {
        machinere sd = new machinere(); 
        sd.scan();                
        sd.print();                  
    }
}
