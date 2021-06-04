package porfolioInvest.Portfolio;

public class Portfolio {
    private String symbol;
    private Integer totalQuantity;
    private double equityValue;
    private double pricePerShare;

    public Portfolio(String symbol,
                     Integer totalQuantity,
                     double equityValue,
                     double pricePerShare)
    {
        this.symbol = symbol;
        this.totalQuantity = totalQuantity;
        this.equityValue = equityValue;
        this.pricePerShare = pricePerShare;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public double getEquityValue() {
        return equityValue;
    }

    public void setEquityValue(double equityValue) {
        this.equityValue = equityValue;
    }

    public double getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare(double pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "symbol='" + symbol + '\'' +
                ", totalQuantity=" + totalQuantity +
                ", equityValue=" + equityValue +
                ", pricePerShare=" + pricePerShare +
                '}';
    }
}
