public interface CoffeeMakerAPI {

    public static CoffeeMakerAPI api = null; // set by main.
    /**
     * This function returns the status of the warmer-plate
     * sensor. This sensor detects the presence of the pot
     * and whether it has coffee in it.
     */
    public WarmerPlateStatus getWarmerPlateStatus();

    /**
     * This function returns the status of the boiler switch.
     * The boiler switch is a float switch that detects if
     * there is more than 1/2 cup of water in the boiler.
     */
    public BoilerStatus getBoilerStatus();

    /**
     * This function returns the status of the brew button.
     * The brew button is a momentary switch that remembers
     * its state. Each call to this function returns the
     * remembered state and then resets that state to
     * BREW_BUTTON_NOT_PUSHED.
     *
     * Thus, even if this function is polled at a very slow
     * rate, it will still detect when the brew button is
     * pushed.
     */
    public BrewButtonStatus getBrewButtonStatus();

    /**
     * This function turns the heating element in the boiler
     * on or off.
     */
    public void setBoilerState(BoilerState boilerState);

    /**
     * This function turns the heating element in the warmer
     * plate on or off.
     */
    public void setWarmerState(WarmerState warmerState);

    /**
     * This function turns the indicator light on or off.
     * The indicator light should be turned on at the end
     * of the brewing cycle. It should be turned off when
     * the user presses the brew button.
     */
    public void setIndicatorState(IndicatorState indicatorState);

    /**
     * This function opens and closes the pressure-relief
     * valve. When this valve is closed, steam pressure in
     * the boiler will force hot water to spray out over
     * the coffee filter. When the valve is open, the steam
     * in the boiler escapes into the environment, and the
     * water in the boiler will not spray out over the filter.
     */
    public void setReliefValveState(ReliefValveState reliefValveState);


    public enum WarmerPlateStatus {

        WARMER_EMPTY(0),
        POT_EMPTY (1),
        POT_NOT_EMPTY(2);

        private int status;

        private WarmerPlateStatus(int status) {
            this.status = status;
        }

    }

    public enum BoilerStatus {

        BOILER_EMPTY(0),
        BOILER_NOT_EMPTY(1);

        private int status;

        private BoilerStatus(int status) {
            this.status = status;
        }

    }


    public enum BrewButtonStatus {

        BREW_BUTTON_PUSHED(0),
        BREW_BUTTON_NOT_PUSHED(1);

        private int status;

        private BrewButtonStatus(int status) {
            this.status = status;
        }

    }

    public enum BoilerState {

        BOILER_ON(0),
        BOILER_OFF (1);

        private int state;

        private BoilerState(int state) {
            this.state = state;
        }

    }

    public enum WarmerState {

        WARMER_ON(0),
        WARMER_OFF(1);

        private int state;

        private WarmerState(int state) {
            this.state = state;
        }

    }

    public enum IndicatorState {

        INDICATOR_ON(0),
        INDICATOR_OFF(1);

        private int state;

        private IndicatorState(int state) {
            this.state = state;
        }

    }

    public enum ReliefValveState {

        VALVE_OPEN(0),
        VALVE_CLOSED(1);

        private int state;

        private ReliefValveState(int state) {
            this.state = state;
        }

    }

}
