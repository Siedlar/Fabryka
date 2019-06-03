class Burger extends AbstractProduct {
 
    public Burger() {
        description = "Podstawowy burger";
    }
 
    @Override
    public double price() {
        return 8.00;
    }
    
}