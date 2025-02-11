package dynamic_online_market_test;

import dynamic_online_market.Books;
import dynamic_online_market.Catalog;
import dynamic_online_market.Clothing;
import dynamic_online_market.Product;
import org.junit.Assert;
import org.junit.Test;

public class CatalogTest {
    @Test
    public void tester(){
        // list 1 for compare
        Product<Catalog> list=new Product<>();
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

        // list 2 for comparision
        Product<Catalog>list2=new Product<>();
        Product<Clothing>cloth2=new Product<>();
        Clothing ob1=new Clothing("CK");
        Clothing obn=new Clothing("Jockey");
        cloth2.addItem(ob2);
        list2.addItem(ob2);
        cloth2.addItem(obn);
        list2.addItem(ob3);

        // adding books
        Books ob5=new Books("Cosmos");
        list2.addItem(ob5);

        Books ob6=new Books("The secret");
        list2.addItem(ob6);

        Assert.assertEquals(list.getItem().contains("CK"),list2.getItem().contains("CK"));

    }


}
