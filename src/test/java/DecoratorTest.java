import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DecoratorTest {

	@Test
	void testInitBasicBurger(){
		Burger order = new BasicBurger();
		assertEquals("BasicBurger", order.getClass().getName(), "did not initialize proper object");
	}

	@Test
	void testInitAvocado(){
		Burger b = new BasicBurger();
		Avocado a = new Avocado(b);
		assertEquals("Avocado", a.getClass().getName(), "did not initialize proper object");
	}

	@Test
	void testInitFriedEgg(){
		Burger b = new BasicBurger();
		FriedEgg f = new FriedEgg(b);
		assertEquals("FriedEgg", f.getClass().getName(), "did not initialize proper object");
	}

	@Test
	void testBacon(){
		Burger b = new BasicBurger();
		Bacon a = new Bacon(b);
		assertEquals("Bacon", a.getClass().getName(), "did not initialize proper object");
	}

	@Test
	void testBasicBurger() {
		Burger order = new BasicBurger();
		double cost = order.makeBurger();
		assertEquals(6.50, cost, "did not get correct total");
	}

	@Test
	void test1Topping() {
		Burger order = new Avocado(new BasicBurger());
		double cost = order.makeBurger();
		assertEquals(8.50, cost, "did not get correct total");
	}

	@Test
	void test2Toppings() {
		Burger order = new Bacon(new RoastedPeppers(new BasicBurger()));
		double cost = order.makeBurger();
		assertEquals(10.50, cost, "did not get correct total");
	}

	@Test
	void test3Toppings() {
		Burger order = new Avocado(new FriedEgg(new GrilledOnions(new BasicBurger())));
		double cost = order.makeBurger();
		assertEquals(12.50, cost, "did not get correct total");
	}

	@Test
	void test4ToppingsWithDouble() {
		Burger order = new GrilledOnions(new Avocado(new FriedEgg(new GrilledOnions(new BasicBurger()))));
		double cost = order.makeBurger();
		assertEquals(14.50, cost, "did not get correct total");
	}

	@Test
	void testTripleBacon() {
		Burger order = new Bacon(new Bacon( new Bacon(new BasicBurger())));
		double cost = order.makeBurger();
		assertEquals(12.50, cost, "did not get correct total");
	}

}
