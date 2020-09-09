public class BoilerWater implements IObserver {

    private CoffeeMakerAPI coffeeMakerAPI;

    public BoilerWater(CoffeeMakerAPI coffeeMakerAPI) {
        this.coffeeMakerAPI = coffeeMakerAPI;
    }

    @Override
    public void update(IObservable o) {
        CoffeeMakerAPI.BoilerStatus boilerStatus = coffeeMakerAPI.getBoilerStatus();
        Boiler.hasWater = boilerStatus == CoffeeMakerAPI.BoilerStatus.BOILER_NOT_EMPTY;
        if (!Boiler.hasWater) {
            coffeeMakerAPI.setBoilerState(CoffeeMakerAPI.BoilerState.BOILER_OFF);
        }
    }
}
