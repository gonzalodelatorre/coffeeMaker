public class IndicatorWater implements IObserver {

    private CoffeeMakerAPI coffeeMakerAPI;

    public IndicatorWater(CoffeeMakerAPI coffeeMakerAPI) {
        this.coffeeMakerAPI = coffeeMakerAPI;
    }

    @Override
    public void update(IObservable o) {
        CoffeeMakerAPI.BoilerStatus boilerStatus = coffeeMakerAPI.getBoilerStatus();
        Indicator.hasWater = boilerStatus == CoffeeMakerAPI.BoilerStatus.BOILER_NOT_EMPTY;
        if (Indicator.isBrewing && boilerStatus == CoffeeMakerAPI.BoilerStatus.BOILER_EMPTY) {
            coffeeMakerAPI.setIndicatorState(CoffeeMakerAPI.IndicatorState.INDICATOR_ON);
            Indicator.isBrewing = false;
        }
    }
}