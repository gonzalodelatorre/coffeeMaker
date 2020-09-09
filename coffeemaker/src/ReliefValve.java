public class ReliefValve implements IObserver {

    private CoffeeMakerAPI coffeeMakerAPI;

    public ReliefValve(CoffeeMakerAPI coffeeMakerAPI) {
        this.coffeeMakerAPI = coffeeMakerAPI;
    }

    @Override
    public void update(IObservable o) {
        CoffeeMakerAPI.WarmerPlateStatus warmerPlateStatus = coffeeMakerAPI.getWarmerPlateStatus();
        if (warmerPlateStatus == CoffeeMakerAPI.WarmerPlateStatus.WARMER_EMPTY) {
            coffeeMakerAPI.setReliefValveState(CoffeeMakerAPI.ReliefValveState.VALVE_OPEN);
        } else {
            coffeeMakerAPI.setReliefValveState(CoffeeMakerAPI.ReliefValveState.VALVE_CLOSED);
        }

    }

}
