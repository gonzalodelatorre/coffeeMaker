public class CoffeeMaker implements CoffeeMakerAPI {

    private BoilerState boilerState;
    private WarmerState warmerState;
    private IndicatorState indicatorState;
    private ReliefValveState reliefValveState;
    private WarmerPlateStatus warmerPlateStatus;
    private BoilerStatus boilerStatus;
    private BrewButtonStatus brewButtonStatus;


    public CoffeeMaker(WarmerPlateStatus warmerPlateStatus, BoilerStatus boilerStatus, BrewButtonStatus brewButtonStatus){
        this.warmerPlateStatus = warmerPlateStatus;
        this.boilerStatus = boilerStatus;
        this.brewButtonStatus = brewButtonStatus;
    }


    @Override
    public WarmerPlateStatus getWarmerPlateStatus() {
        return warmerPlateStatus;
    }

    @Override
    public BoilerStatus getBoilerStatus() {
        return boilerStatus;
    }

    @Override
    public BrewButtonStatus getBrewButtonStatus() {
        return brewButtonStatus;
    }

    @Override
    public void setBoilerState(BoilerState boilerState) {
        this.boilerState = boilerState;

    }

    @Override
    public void setWarmerState(WarmerState warmerState) {
        this.warmerState = warmerState;

    }

    @Override
    public void setIndicatorState(IndicatorState indicatorState) {
        this.indicatorState = indicatorState;
    }

    @Override
    public void setReliefValveState(ReliefValveState reliefValveState) {
        this.reliefValveState = reliefValveState;

    }
}
