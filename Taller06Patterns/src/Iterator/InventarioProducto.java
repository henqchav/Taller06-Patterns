package Taller06Patterns.src.Iterator;

public class InventarioProducto implements Inventario{
    public Iterator crearProductosDisponiblesWeb(Producto producto){
        //crea y devuelve un nuevo iterador para todos los productos disponibles
        Iterator iterador = new ProductIterator();
        return iterador;
    }

    public Iterator crearProductosDisponiblesTienda(Producto producto){
        //crea y devuelve un nuevo iterador para todos los productos en la tienda a la que pertenece el usuario
        Iterator iterador = new ProductIterator();
        return iterador;
    }


    public Iterator crearProductosFallas(Producto producto){
        //crea y devuelve un nuevo iterador para todos los productos con fallas reportadas
        Iterator iterador = new ProductIterator();
        return iterador;
    }


    public Iterator crearProductosReparación(Producto producto){
        //crea y devuelve un nuevo iterador para todos los productos que requieren reparación
        Iterator iterador = new ProductIterator();
        return iterador;
    }

    
}
