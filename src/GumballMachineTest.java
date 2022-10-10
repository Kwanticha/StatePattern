import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GumballMachineTest {

	@Test
	void testGumballMachine() {
		GumballMachine machine1 = new GumballMachine(5);
		machine1.insertQuarter();//HasQuarter
		machine1.ejectQuarter();//NoQuarter
		machine1.turnCrank(); //slodState NoQuarter
		machine1.insertQuarter();//HasQuarter
		machine1.ejectQuarter();//NoQuarter
		machine1.turnCrank(); //slodState NoQuarter
		machine1.insertQuarter();//HasQuarter
		machine1.ejectQuarter();//NoQuarter
		machine1.turnCrank(); //slodState NoQuarter
		machine1.insertQuarter();//HasQuarter
		machine1.ejectQuarter();//NoQuarter
		machine1.turnCrank(); //slodState NoQuarter
	}

}
