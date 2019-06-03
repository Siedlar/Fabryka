class Bekon extends AbstractProductDecorator {

    public Bekon(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", bekon";
    }

    @Override
    public double price() {
        return product.price() + 3.50;
    }
    
}
