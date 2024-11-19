package Abstract_classes_and_methods;

abstract class Product {
    
    private int productId;
    private String name;
    private float price;

    // constructor
    public Product(int productId,String name) { 
        this.productId=productId;
        this.name = name; 
    }
    // Getters...
    public int getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    } 
    public float getPrice()
    {
        return price;
    }

    // Setters
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    
    abstract public String getDescription();
}
class ElectronicsProduct extends Product
{
    private String brand;
    
    public ElectronicsProduct(int productId,String name,float price,String brand) {
        super(productId,name);
        super.setPrice(price);
        this.brand = brand;
    }
    
    @Override
    public String getDescription()
    {
        return "Product ID: "+getProductId()+"\nName:"+this.getName()+"\nBrand: "+brand+"\nPrice :"+getPrice();
    }
}
class ClothingProduct extends Product
{
    private String size;
    
    public ClothingProduct(int productId,String name,float price,String size) {
        super(productId,name);
        super.setPrice(price);
        this.size = size;
    }
    
    @Override
    public String getDescription()
    {
        return "Product ID: "+getProductId()+"\nName:"+this.getName()+"\nSize: "+size+"\nPrice :"+getPrice();
    }

}
class BookProduct extends Product
{
    private String author;
    
    public BookProduct(int productId,String name,float price,String author) {
        super(productId,name);
        super.setPrice(price);
        this.author = author;
    }
    
    @Override
    public String getDescription()
    {
        return "Product ID: "+getProductId()+"\nName:"+this.getName()+"\nauthor: "+author+"\nPrice :"+getPrice();
    }
}
