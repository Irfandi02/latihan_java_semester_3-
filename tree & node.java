package strukturdata_tree;

public class StrukturData_Tree {

    public static void main(String[] args) {

        
        Data akar = new Data("1");
        Data kanan = new Data("10");
        Data kiri = new Data("8");

        akar.kanan = kanan;
        akar.kiri = kiri;

        System.out.println("data di simpul akar  :" + akar.dataTree);
        System.out.println("data di simpul kanan :" + akar.kanan.dataTree);
        System.out.println("data di simpul kiri  :" + akar.kiri.dataTree);
    }

}


node treee :

package strukturdata_tree;

public class Data {

    String dataTree;
    Data kanan;
    Data kiri;
    
    public Data(String dataTree){
        this.dataTree = dataTree;
        this.kanan = null;
        this.kiri = null;
        
        
    }

}
