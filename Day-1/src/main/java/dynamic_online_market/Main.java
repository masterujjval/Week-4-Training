package dynamic_online_market;

public class Main {
    public static void main(String[] args) {
        // product includes clothing items
        Product<Catalog>list=new Product<>();
        Product<Clothing>cloth=new Product<>();
        Clothing ob=new Clothing("CK");
        Clothing ob2=new Clothing("Jockey");
        cloth.addItem(ob);
        list.addItem(ob);
        cloth.addItem(ob2);
        list.addItem(ob2);

        // adding books
        Books ob3=new Books("Cosmos");
        list.addItem(ob3);

        Books ob4=new Books("The secret");
        list.addItem(ob4);

        CatalogUtils it=new CatalogUtils();
        it.displayAll(list.getItem());


    }
}
