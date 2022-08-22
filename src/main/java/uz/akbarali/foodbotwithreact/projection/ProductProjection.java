package uz.akbarali.foodbotwithreact.projection;

public interface ProductProjection extends IdProjection{
    String getName();
    double getPrice();
    Byte[] getImage();
}
