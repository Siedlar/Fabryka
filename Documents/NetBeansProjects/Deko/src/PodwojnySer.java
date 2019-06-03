class PodwojnySer extends AbstractProductDecorator {

    public PodwojnySer(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", podwójny ser";
    }

    @Override
    public double price() {
        return product.price() + 2.50;
    }
    
}