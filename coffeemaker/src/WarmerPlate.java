public class WarmerPlate implements IObserver {

    private CoffeeMakerAPI coffeeMakerAPI;

    public WarmerPlate(CoffeeMakerAPI coffeeMakerAPI) {
        this.coffeeMakerAPI = coffeeMakerAPI;
    }

    @Override
    public void update(IObservable o) {
        CoffeeMakerAPI.WarmerPlateStatus warmerPlateStatus = coffeeMakerAPI.getWarmerPlateStatus();
        if(warmerPlateStatus == CoffeeMakerAPI.WarmerPlateStatus.POT_NOT_EMPTY){
            coffeeMakerAPI.setWarmerState(CoffeeMakerAPI.WarmerState.WARMER_ON);
        } else {
            coffeeMakerAPI.setWarmerState(CoffeeMakerAPI.WarmerState.WARMER_OFF);
        }

    }
}
