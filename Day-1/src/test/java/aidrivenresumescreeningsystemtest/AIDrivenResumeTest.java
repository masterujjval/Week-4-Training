package aidrivenresumescreeningsystemtest;

import org.junit.Assert;
import org.junit.Test;
import smartware_house_management_system.Electronics;
import smartware_house_management_system.Storage;


public class AIDrivenResumeTest {
    @Test
    public void tester1(){
        Electronics television1=new Electronics("Lenovo");
        Storage<Electronics> storageElectronics=new Storage<>();
        storageElectronics.addItem(television1);
        Assert.assertEquals(1,storageElectronics.getList().size());
    }

    @Test
    public void tester2(){
        Electronics television1=new Electronics("Lenovo");
        Storage<Electronics> storageElectronics=new Storage<>();
        storageElectronics.addItem(television1);

        Assert.assertEquals("Lenovo",storageElectronics.getList().get(0).getName());

    }
}
