interface RBI {
    double rateOfInterest();
}

class KVB implements RBI {
    public double rateOfInterest() {
        return 6.0;
    }
}

class AXIS implements RBI {
    public double rateOfInterest() {
        return 7.5;
    }
}

class prob10 {
    public static void main(String[] args) {
        KVB kvb = new KVB();
        AXIS axis = new AXIS();

        System.out.println("Rate of Interest of KVB: " + kvb.rateOfInterest());
        System.out.println("Rate of Interest of AXIS: " + axis.rateOfInterest());
    }
}