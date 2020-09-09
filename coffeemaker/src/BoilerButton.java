public class BoilerButton implements IObserver {

    private CoffeeMakerAPI coffeeMakerAPI;

    public BoilerButton(CoffeeMakerAPI coffeeMakerAPI) {
        this.coffeeMakerAPI = coffeeMakerAPI;
    }

    @Override
    public void update(IObservable o) {
        CoffeeMakerAPI.BrewButtonStatus brewButtonStatus = coffeeMakerAPI.getBrewButtonStatus();
        if (!Boiler.hasWater && brewButtonStatus == CoffeeMakerAPI.BrewButtonStatus.BREW_BUTTON_PUSHED) {
            coffeeMakerAPI.setBoilerState(CoffeeMakerAPI.BoilerState.BOILER_ON);
        }
    }
}

