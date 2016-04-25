package fr.inti.banque.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import fr.inti.banque.dao.IDaoClient;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml"})
public class ClasseTest {

@Autowired
IDaoClient daoClient;

	@Test
	public void getAll() {
		assertEquals(27,daoClient.getAll().size());
	}	
}
