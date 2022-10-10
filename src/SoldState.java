
public class SoldState implements State {
	GumballMachine gumballMachine ;
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
    
	@Override
	public void insertQuarter() {
		System.out.print("Please wait,we're already giving you a gumball");

	}

	@Override
	public void ejectQuarter() {
		System.out.print("Sorryr,you already turned the crank");

	}

	@Override
	public void turnCrank() {
		System.out.print("Turning twice doesnit get you another gumnall");


	}

	@Override
	public void dispense() {
		if (gumballMachine.getCount()>0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
			
		} else {
			System.out.println("Oops,out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}

	}

}
