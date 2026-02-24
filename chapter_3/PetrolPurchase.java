public class PetrolPurchase{

    private String stationLocation;
    private String petrolType;
    private int quantity;
    private double pricePerLiter;
    private double percentageDiscount;

    
    public PetrolPurchase(String stationLocation, String petrolType,int quantity, double pricePerLiter, double percentageDiscount){
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    
    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }





    public String getStationLocation() {
        return stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }




    public double getPurchaseAmount() {
        double totalCost = quantity * pricePerLiter;
        double discountAmount = (percentageDiscount / 100) * totalCost;
        return totalCost - discountAmount;
    }
}







public class Petrol {

    public static void main(String[] args) {

        PetrolPurchase purchase = new PetrolPurchase(
                "Abuja Central Station",
                "Premium Motor Spirit",
                50,
                650.0,
                5.0
        );

        
        System.out.println("Station Location: " + purchase.getStationLocation());
        System.out.println("Petrol Type: " + purchase.getPetrolType());
        System.out.println("Quantity (Liters): " + purchase.getQuantity());
        System.out.println("Price per Liter: " + purchase.getPricePerLiter());
        System.out.println("Discount (%): " + purchase.getPercentageDiscount());

        System.out.println("Net Purchase Amount: ₦" + purchase.getPurchaseAmount());
    }
}

