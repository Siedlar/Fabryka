class SosBBQ extends AbstractProductDecorator {

    public SosBBQ(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", sos BBQ";
    }

    @Override
    public double price() {
        return product.price() + 3.00;
    }
    
}
