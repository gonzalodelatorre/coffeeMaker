
public class Main {

    public static void main(String[] args) {

        System.out.println("Coffee Maker Mark IV");
        CoffeeMakerAPI coffeeMaker = new CoffeeMaker(CoffeeMakerAPI.WarmerPlateStatus.POT_EMPTY,
                CoffeeMakerAPI.BoilerStatus.BOILER_EMPTY, CoffeeMakerAPI.BrewButtonStatus.BREW_BUTTON_NOT_PUSHED);
        // Should be empty.
        coffeeMaker.setReliefValveState(CoffeeMakerAPI.ReliefValveState.VALVE_CLOSED);

        BoilerButton boilerButton = new BoilerButton(coffeeMaker);
        BoilerWater boilerWater = new BoilerWater(coffeeMaker);
        IndicatorButton indicatorButton = new IndicatorButton(coffeeMaker);
        IndicatorWater indicatorWater = new IndicatorWater(coffeeMaker);
        ReliefValve reliefValve = new ReliefValve(coffeeMaker);
        WarmerPlate warmerPlate = new WarmerPlate(coffeeMaker);


        Control control = new Control();
        control.attach(boilerButton);
        control.attach(boilerWater);
        control.attach(indicatorButton);
        control.attach(indicatorWater);
        control.attach(reliefValve);
        control.attach(warmerPlate);

        while (true) {
            System.out.println("Coffee Maker Mark IV... Working");
            control.notifyAllObservers();
        }


    }


}
