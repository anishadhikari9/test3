class thepizzastore {
    public static double calculateTotalBill(String pizzaSize, int toppingCount) {
        double basePrice;

        switch (pizzaSize) {
            case "XL":
                basePrice = 15.00;
                break;
            case "L":
                basePrice = 12.00;
                break;
            case "M":
                basePrice = 10.00;
                break;
            case "S":
                basePrice = 8.00;
                break;
            default:
                throw new IllegalArgumentException("Invalid pizza size");
        }

        double toppingsPrice = 1.50 * toppingCount;
        double totalBill = basePrice + toppingsPrice;
        return totalBill + (totalBill * 0.15); // Add 15% HST
    }
}
