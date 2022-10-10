
public class HasQuarterState implements State {
	GumballMachine gumballMachine ;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		System.out.print("You can't insert another quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.print("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());

	}

	@Override
	public void turnCrank() {
		System.out.print("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());


	}

	@Override
	public void dispense() {
		System.out.print("No gumball dispensed");
	}

}
