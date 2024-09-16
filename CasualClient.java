public class CasualClient extends Client {
    public String lastPurchase;
    
    public CasualClient(String name, int cI, int nIT, String lastPurchase) {
        super(name, cI, nIT);
        this.lastPurchase = lastPurchase;
    }

    public String getLastPurchase() {
        return lastPurchase;
    }

    public void setLastPurchase(String lastPurchase) {
        this.lastPurchase = lastPurchase;
    }

    
}
