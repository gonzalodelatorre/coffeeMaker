public class IndicatorButton implements IObserver {

    private CoffeeMakerAPI coffeeMakerAPI;

    public IndicatorButton(CoffeeMakerAPI coffeeMakerAPI) {
        this.coffeeMakerAPI = coffeeMakerAPI;
    }

    @Override
    public void update(IObservable o) {
        CoffeeMakerAPI.BrewButtonStatus brewButtonStatus = coffeeMakerAPI.getBrewButtonStatus();
        if (Indicator.hasWater && brewButtonStatus == CoffeeMakerAPI.BrewButtonStatus.BREW_BUTTON_PUSHED) {
            coffeeMakerAPI.setIndicatorState(CoffeeMakerAPI.IndicatorState.INDICATOR_OFF);
            Indicator.isBrewing = true;
        }
    }
}
