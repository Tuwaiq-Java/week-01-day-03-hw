class InvoiceItem{
    private int id, qty;
    private String desc;
    private double unitPrice;

    public InvoiceItem(int id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.qty = qty;
        this.desc = desc;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public String getDesc() {
        return desc;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return qty*unitPrice;
    }

    public String toString() {
        return "InvoiceItem[id=" + this.id + ",desc=" + this.desc + ",qty="+this.qty + ",unitPrice="+ this.unitPrice + "]";
    }
}

public class Ex5 {

    public static void main(String[] args) {

        InvoiceItem i1 = new InvoiceItem(1, "Book", 2, 25.50);
        System.out.println("getId(): "+i1.getId());
        System.out.println("getDesc(): "+i1.getDesc());
        System.out.println("getQty(): "+i1.getQty());
        System.out.println("getUnitPrice(): "+i1.getUnitPrice());
        System.out.println("getTotal(): "+i1.getTotal());
        System.out.println(i1.toString());


    }
}
